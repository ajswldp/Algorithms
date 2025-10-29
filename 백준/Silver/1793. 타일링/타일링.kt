import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val board = Array(251){ LongArray(10) }
    board[0][0] = 1L
    board[1][0] = 1L
    while(true){
        val input = readLine()?:break
        val n = input.toInt()
        f(board, n)
        var flag = false
        for(i in 9 downTo 0){
            if(flag) print(String.format("%08d", board[n][i]))
            else if(board[n][i] != 0L){
                flag = true
                print(board[n][i])
            }
        }
        println()
    }
}
fun f(board: Array<LongArray>, n:Int) {
    if(board[n][0] != 0L)return
    if(board[n-1][0] == 0L) f(board, n-1)
    for(i in 0..9){
        val num = board[n-1][i] + board[n-2][i] * 2
        board[n][i] += num
        if(i!=9)board[n][i+1] +=  board[n][i] / 100000000L
        board[n][i] = board[n][i] % 100000000L
    }
}