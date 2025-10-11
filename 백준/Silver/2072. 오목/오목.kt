import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val board = Array(21){IntArray(21)}
    var t = 0
    for(i in 0 until n){
        t++
        val (x,y) = readLine().split(" ").map { it.toInt() }
        board[x][y] = i%2 + 1
        if(f(board,x, y, 1, 1) || f(board,x, y, 1, 0) || f(board,x, y, 1, -1) || f(board,x, y, 0, 1)){
            print(t)
            return
        }
    }
    print(-1)
}
fun f(board: Array<IntArray>, x1:Int, y1:Int, a:Int, b:Int): Boolean{
    var count = 1
    var x = x1 + a
    var y = y1 + b
    while(board[x][y] == board[x1][y1]){
        count++
        x += a
        y += b
    }
    x = x1 - a
    y = y1 - b
    while(board[x][y] == board[x1][y1]){
        count++
        x -= a
        y -= b
    }
    return count == 5
}