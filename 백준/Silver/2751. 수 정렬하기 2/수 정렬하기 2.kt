
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*
fun main(args: Array<String>): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()!!.toInt()
    val list = LinkedList<Int>()
    for(i in 1..n) {
        list.add(readLine()!!.toInt())
    }
    list.sort()
    val s = StringBuilder("")
    list.forEach {s.append(it).append("\n")}
    print(s)
}