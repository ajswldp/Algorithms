import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (k, n) = readLine().split(" ").map { it.toInt() }
    var num = k
    while(num.toString(2).toCharArray().count { it == '1' } >n){
        num += num.and(-num)
    }
    print(num-k)
}
