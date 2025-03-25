import java.io.*
import java.util.*
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val list = ArrayList<LongArray>()
    for(i in 0 until n) {
        list.add(readLine().split(" ").map { it.toLong() }.toLongArray())
    }
    list.sortBy {it[0]*1000000 + it[1]}
    for(i in list){
        println(i.joinToString(" "))
    }
}