import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    readLine()
    val list = readLine().split(' ').map { it.toInt() }
    val n = readLine().toInt()
    println(list.filter { it==n }.size)
}