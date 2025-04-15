import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (n, t) =readLine().split(" ").map { it.toLong() }
    while(t-- > 0) {
        if ((n shr 1) shl 1 == n) {
            n = (n shr 1) xor 6
        }
        else{
            n = (n shl 1) xor 6
        }
    }
    println(n)
}