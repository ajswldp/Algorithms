import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val board = Array(n + 1) { IntArray(n + 1) }
    for(i in 1..m){
        val (x, y) = readLine().split(" ").map { it.toInt() }
        board[x][y] = 1
        board[y][x] = 1
    }
    for(i in 1..n){
        for(j in 1..n){
            if(i == j)continue
            for(k in 1..n){
                if(i == k || j == k)continue
                if(board[j][i] >= 1 && board[i][k] >= 1){
                    if(board[j][k] == 0)board[j][k] = board[j][i] + board[i][k]
                    else board[j][k] = min(board[j][k], board[j][i] + board[i][k])
                }
            }
        }
    }
    board[0][0] = Int.MAX_VALUE
    val arr = board.map { it.sum() }
    println(arr.indexOf(arr.min()))
}