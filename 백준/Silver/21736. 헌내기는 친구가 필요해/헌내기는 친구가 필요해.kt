import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val board = Array(n){ readLine().toCharArray() }
    val idx = board.reduce { acc, str ->  acc+str}.indexOf('I')
    val x = idx / m
    val y = idx % m
    var count = 0
    val q = mutableListOf(Pair(x, y))
    while(q.isNotEmpty()){
        val (x, y) = q.removeFirst()
        if(f(board, x+1,  y, q))count++
        if(f(board, x-1,  y, q))count++
        if(f(board, x,  y+1, q))count++
        if(f(board, x,  y-1, q))count++
    }
    if(count == 0) print("TT")
    else print(count)
}
fun f(board:Array<CharArray>, x:Int, y:Int, q: MutableList<Pair<Int, Int>>): Boolean{
    if(x < 0 || y < 0 || x >= board.size || y >= board[0].size) return false
    if(board[x][y] == 'X') return false
    q.add(Pair(x, y))
    val bool = board[x][y] == 'P'
    board[x][y] = 'X'
    return bool
}