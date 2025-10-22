import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val board = Array(n){ readLine().split(' ').map { it.toInt() }.toIntArray() }
    val sum = board.sumOf { it.sumOf { it.toLong() } } + r
    val num = (sum / n / m).toInt()
    var min = Long.MAX_VALUE
    for(i in num downTo -3){
        val count = board.sumOf { it.sumOf { if(it >= i) (it-i)*2L else i-it.toLong() } }
        if(count < min) min = count
        else {
            println(min)
            print(i+1)
            break
        }
    }
}