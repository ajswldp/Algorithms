import java.io.*
import java.util.*
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val input = readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<Int, Int>()
    for(i in input){
        map[i] = 1
    }
    readLine()
    val input2 = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    for(i in input2){
        sb.append((if(map.containsKey(i)) 1 else 0).toString() + "\n")
    }
    println(sb.toString())
}