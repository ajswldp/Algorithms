import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt()
    val board = Array(n) { readLine().split(" ").map { it.toInt() }.toIntArray()}
    for(i in 0 until n){
        for(j in 0 until n){
            if(board[j][i] == 0)continue
            for(k in 0 until n){
                if(board[j][i] == 1 && board[i][k] == 1)board[j][k] = 1
            }
        }
    }
    board.forEach { println(it.joinToString(" ")) }
}