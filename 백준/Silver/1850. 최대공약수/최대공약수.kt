import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (a, b) = readLine().split(' ').map { it.toLong() }
    while(true){
        val c = a%b
        if(c == 0L)break
        a = b
        b = c
    }
    val sb = StringBuilder()
    for(i in 0 until b){
        sb.append('1')
    }
    println(sb)
}
