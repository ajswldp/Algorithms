import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val board = Array(n) { readLine().toCharArray().map { it.code - '0'.code } }
    val min = minOf(n, m)
    var max = 1
    for(i in board.indices){
        for(j in board[i].indices){
            for(k in max until min){
                if(k+j >= board[i].size) break
                if(k+i >= board.size) break
                val arr = arrayOf(board[i][j], board[i+k][j], board[i][j+k], board[i+k][j+k])
                if(arr.all { it == arr[0] }){
                    max = k+1
                }
            }
        }
    }
    print(max*max)
}