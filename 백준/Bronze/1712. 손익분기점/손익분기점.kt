import java.io.BufferedReader
import java.io.InputStreamReader
fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b, c) = readLine().split(" ").map { it.toInt() }
    if(b >= c)print(-1)
    else{
        val num = c-b
        val d = (a-1)/num
        print(d+1+if(a%num==0)1 else 0)
    }
}