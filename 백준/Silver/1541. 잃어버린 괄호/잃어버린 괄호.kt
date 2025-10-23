import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val s = readLine()
    if(!s.contains('-')){
        println(s.split('+').sumOf { it.toInt() })
        return
    }
    val s1 = s.substring(0,  s.indexOf('-'))
    val s2 = s.substring(s.indexOf('-')+1)
    println(s1.split('+').sumOf { it.toInt() } - s2.replace('-', '+').split('+').sumOf { it.toInt() })
}