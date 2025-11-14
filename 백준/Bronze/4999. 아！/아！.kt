import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    print(if(readLine().length >= readLine().length) "go" else "no")
}