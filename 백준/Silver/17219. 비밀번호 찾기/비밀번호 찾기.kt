import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, String>()
    for(i in 0 until n){
        val input = readLine().split(" ")
        map.put(input[0], input[1])
    }
    for(i in 0 until m){
        println(map.get(readLine()))
    }
}