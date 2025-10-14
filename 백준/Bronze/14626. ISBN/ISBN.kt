import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val s = readLine()
    val one = s.indexOf('*')%2 == 0
    val num = s.replace("*","0")
        .split("")
        .filter { it != "" }
        .map { it.toInt() }
        .reduceIndexed { index, acc, i -> acc + i * if(index%2 == 0) 1 else 3 } % 10
    val ans = (10 - num) % 10
    if(one) print(ans)
    else print((((30-ans)%3) * 10 + ans)/3)
}