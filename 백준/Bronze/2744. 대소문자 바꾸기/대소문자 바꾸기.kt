import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    print(readLine().map { if(it.code >= 'a'.code) (it.code - 32).toChar() else (it.code + 32).toChar()}.joinToString(""))
}