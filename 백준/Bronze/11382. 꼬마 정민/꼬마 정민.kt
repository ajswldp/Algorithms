import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    print(readLine().split(' ').map { it.toLong() }.sum())
}