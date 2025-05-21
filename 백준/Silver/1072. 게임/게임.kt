import java.io.*
import kotlin.math.ceil

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b) = readLine().split(" ").map { it.toDouble() }
    if(b*100/a >= 99){
        print(-1)
        return
    }
    val num = (a-b)*100
    val p = ceil(num/a)-1
    print(ceil(num/p).toInt()-a.toInt())
}
