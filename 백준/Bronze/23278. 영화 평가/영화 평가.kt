import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, a, b) =readLine().split(" ").map { it.toInt() }
    val arr = readLine().split(" ").map { it.toDouble() }.sorted().drop(a).dropLast(b)
    print(arr.sum()/arr.size)
}