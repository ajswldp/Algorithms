import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val board = Array(9){readLine().split(' ').map{ it.toInt() }.toIntArray()}
    var x = 0
    var y = 0
    val stack = Stack<Data>()
    while(x<9){
        if(board[x][y] != 0){
            y++
            x += y/9
            y %= 9
            continue
        }
        val list = (1..9).toMutableList()
        for(i in 0 until 9){
            list.remove(board[x][i])
            list.remove(board[i][y])
            list.remove(board[x/3*3 + i/3][y/3*3 + i%3])
        }
        if(list.isEmpty()){
            while(stack.peek().list.isEmpty()){
                val d = stack.pop()
                board[d.x][d.y] = 0
            }
            val data = stack.peek()
            x = data.x
            y = data.y
            board[x][y] = data.list.removeFirst()
        }
        else{
            val num = list.removeFirst()
            board[x][y] = num
            stack.add(Data(x, y, list))
        }
    }
    board.forEach{
        println(it.joinToString(" "))
    }
}
data class Data(val x:Int, val y:Int, val list: MutableList<Int>)