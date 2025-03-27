import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val list = ArrayList<List<Int>>()
    for(i in 0 until n) {
        list.add(readLine().split(" ").map { it.toInt() })
    }
    list.sortedBy { it[1]*1000000L + it[0] }.forEach { println(it.joinToString(" ")) }
}