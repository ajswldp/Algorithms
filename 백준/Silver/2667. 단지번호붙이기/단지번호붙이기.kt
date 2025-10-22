import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val board = Array(n) { readLine().toCharArray() }
    val pq = PriorityQueue<Int>()
    for(i in board.indices){
        for(j in board[i].indices){
            if(board[i][j] == '1') pq.add(f(i,j,board))
        }
    }
    println(pq.size)
    while(pq.isNotEmpty()) println(pq.poll())
}
fun f(x:Int, y:Int, board:Array<CharArray>):Int{
    board[x][y] = '0'
    var count = 1
    if(x>0 && board[x-1][y]=='1') count+=f(x-1,y,board)
    if(x<board.size-1 && board[x+1][y]=='1') count+=f(x+1,y,board)
    if(y>0 && board[x][y-1]=='1') count+=f(x,y-1,board)
    if(y<board[x].size-1 && board[x][y+1]=='1') count+=f(x,y+1,board)
    return count
}