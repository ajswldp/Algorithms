import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sum = 0
    for(i in 1..5){
        sum += readLine().toInt()
    }
    print(sum)
}