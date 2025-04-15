import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()
    val n = readLine().toInt() / a
    print(n*readLine().toInt())
}
