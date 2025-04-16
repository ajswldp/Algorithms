import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val list = ArrayList<IntArray>()
    for(i in 0 until n) {
        list.add(readLine().split(' ').map { it.toInt() }.toIntArray())
    }
    val count = IntArray(n)
    list.forEach {
        for(i in 0 until n) {
            if(list[i][0] < it[0] && list[i][1] < it[1]) count[i]++
        }
    }
    val sorted = count.sorted()
    count.forEach { print("${it+1} ") }
}