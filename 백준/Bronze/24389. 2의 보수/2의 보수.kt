import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toLong()
    var a = n.and(-n)
    var count = 0
    while( a != 0L ){
        a/=2
        count++
    }
    print(32-count)
}
