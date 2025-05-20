import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (n, a, b) = readLine().split(" ").map { it.toInt() }
    var count = 0
    while(a!=b){
        a = (a+1)/2
        b = (b+1)/2
        count++
    }
    print(count)
}