import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var t = readLine().toInt()
    while(t-->0){
        val n = readLine().toInt()
        if(n < 2){
            println(n)
            if(n == 1)readLine()
            continue
        }
        val map = mutableMapOf<String, Int>()
        for(i in 0 until n){
            val s = readLine().split(' ')[1]
            if(map.containsKey(s)) map[s] = map[s]!!+1
            else map[s] = 2
        }
        println(map.values.reduce{acc, i -> acc*i} - 1)
    }
}