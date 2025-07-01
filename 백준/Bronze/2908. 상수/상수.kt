import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (a, b) = readLine().split(' ').map { it.reversed().toInt() }
    print(if(a>b)a else b)
}