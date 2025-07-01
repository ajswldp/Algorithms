import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (a, b, c) = readLine().split(' ').map { it.toInt() }
    if(a == b && b == c) print(10000 + a*1000)
    else if(a == b || b == c || a == c){
        if(a == b) print(1000 + a*100)
        else print(1000 + c*100)
    }
    else print(max(max(a, b), c)*100)
}