import java.io.*
import java.util.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val t = readLine().split(" ").map(String::toInt)
    val (tn, pn) = readLine().split(" ").map(String::toInt)
    println(t.reduce{ acc, i -> acc + (i+tn-1)/tn}-t[0]+(t[0]+tn-1)/tn)
    print(n/pn)
    print(' ')
    println(n%pn)
}