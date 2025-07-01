import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    for(i in 1 .. n){
        val (a, b) = readLine().split(' ').map { it.toInt() }
        println("Case #$i: $a + $b = ${a+b}")
    }
}