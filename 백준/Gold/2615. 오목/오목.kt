import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val board = Array(21){IntArray(21){0}}
    for(i in 1..19){
        val line = readLine().split(" ").map { it.toInt() }
        line.forEachIndexed{index, value -> board[i][index + 1] = value}
    }
    for(i in 1..19){
        for(j in 1..19){
            if(board[j][i] == 0) continue
            if(f(board, j, i, 1, 0) || f(board, j, i, 0, 1) || f(board, j, i, 1, 1)  || f(board, j, i, -1, 1)){
                println(board[j][i])
                print("$j $i")
                return
            }
        }
    }
    print(0)
}
fun f(board:Array<IntArray>, x1:Int, y1:Int, a:Int, b:Int): Boolean{
    var count = 0
    if(board[x1][y1] == board[x1-a][y1-b]) return false 
    var x = x1
    var y = y1
    while(board[x1][y1] == board[x][y]){
        count++
        x+=a
        y+=b
    }
    return count == 5
}