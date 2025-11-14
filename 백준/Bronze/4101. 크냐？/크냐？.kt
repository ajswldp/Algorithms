import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while( true ) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        if( a == 0 && b == 0 ) return
        println(if(a<=b)"No" else "Yes")
    }
}