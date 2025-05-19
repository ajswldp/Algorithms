import java.io.*
import kotlin.math.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    for(i in 1..n) {
        val input = readLine().split(" ").map { it.toInt() }
        val (x1, y1, r1, x2, y2) = input
        val r2 = input[5]
        val length = sqrt((x1-x2).toDouble().pow(2) + (y1-y2).toDouble().pow(2))
        if(x1==x2&&y1==y2&&r1==r2){
            println(-1)
        }
        else if(length > r1+r2 || max(r1, r2) > min(r1, r2) + length) {
            println(0)
        }
        else if(length == r1+r2.toDouble() || max(r1, r2).toDouble() == min(r1, r2) + length){
            println(1)
        }
        else{
            println(2)
        }
    }
}
