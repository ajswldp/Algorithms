import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    var num = 1L
    for(i in 1..n){
        num *= i
    }
    println(num)
}