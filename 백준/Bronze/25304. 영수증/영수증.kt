import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val k = readLine().toInt()
    val n = readLine().toInt()
    var num = 0
    for(i in 1..n){
        val (a, b) = readLine().split(' ').map { it.toInt() }
        num += a*b
    }
    print(if(k == num)"Yes" else "No")
}