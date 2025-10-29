import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val input = readLine().split(' ').map { it.toInt() }
    val arr = IntArray(input.size)
    for(i in 1 .. arr.size) {
        var num = input[i-1]
        var idx = -1
        while(true)if(arr[++idx] == 0){
            if(num == 0){
                arr[idx] = i
                break
            }
            num--
        }
    }
    println(arr.joinToString(" "))
}
