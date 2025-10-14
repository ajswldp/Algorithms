import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (x1, y1) = readLine().split(' ').map { it.toInt() }
    val (x2, y2) = readLine().split(' ').map { it.toInt() }
    val s1 = (("X".repeat(y2) + ".".repeat(y2)).repeat(y1/2) + if(y1%2 == 0)"\n" else ("X".repeat(y2) + '\n')).repeat(x2)
    val s2 = ((".".repeat(y2) + "X".repeat(y2)).repeat(y1/2) + if(y1%2 == 0)"\n" else (".".repeat(y2) + '\n')).repeat(x2)
    println((s1+s2).repeat(x1/2) + if(x1%2 == 0) "" else (s1))
}
