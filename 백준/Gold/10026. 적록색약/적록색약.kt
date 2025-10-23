import java.io.BufferedReader
import java.io.InputStreamReader

var r = 0
var g = 0
var b = 0
var rg = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val board = Array(n) { readLine().toCharArray() }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (board[i][j] == 'R') {
                r++
                f(board, i, j, 'R', 'O')
            } else if (board[i][j] == 'G') {
                g++
                f(board, i, j, 'G', 'O')
            } else if (board[i][j] == 'B'){
                b++
                f(board, i, j, 'B', 'X')
            }
        }
    }
    for(i in 0 until n){
        for(j in 0 until n){
            if(board[i][j] == 'O') {
                rg++
                f(board, i, j, 'O', 'X')
            }
        }
    }
    println("${r+g+b} ${rg+b}")
}
fun f(board:Array<CharArray>, x:Int, y:Int, c1:Char, c2:Char){
    if(board[x][y] != c1) return
    board[x][y] = c2
    if(x>0) f(board,x-1,y, c1, c2)
    if(x<board.size-1) f(board,x+1,y, c1, c2)
    if(y>0) f(board,x,y-1, c1, c2)
    if(y<board.size-1) f(board,x,y+1, c1, c2)
}