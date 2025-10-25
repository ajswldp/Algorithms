import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val arr = readLine()!!.split(' ').sortedByDescending { it.repeat(10) }
    if(arr.all { it == "0" })println(0)
    else arr.forEach { print(it) }
}