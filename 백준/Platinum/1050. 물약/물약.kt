import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val map = HashMap<String, Long>()
    for (i in 0 until n) {
        val (s, num) = readLine().split(' ')
        map[s] = num.toLong()
    }
    val list = LinkedList<Data>()
    for(i in 0 until m) {
        val (s1, s2) = readLine().split('=')
        list.add(Data(s2.split('+'), s1))
    }
    for(i in 0..m){
        list.forEach {
            if(it.isOk(map)){
                map[it.s] = min(it.getVal(map), map[it.s]?: Long.MAX_VALUE)
            }
        }
    }
    println(map["LOVE"]?:-1)
}
data class Data(
    val s: String,
    val list: List<Pair<Long, String>>
){
    constructor(list: List<String>, s: String):
            this(s, list.map { Pair(it[0].toString().toLong(), it.substring(1))})
    fun isOk(map: Map<String, Long>): Boolean {
        return list.all { map.containsKey(it.second) }
    }
    fun getVal(map: Map<String, Long>): Long {
        return min(list.sumOf { it.first * map[it.second]!! }, 1000000001)
    }
}