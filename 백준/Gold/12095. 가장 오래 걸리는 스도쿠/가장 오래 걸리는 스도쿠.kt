import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = "9 8 7 6 5 4 3 2 1\n" +
            "6 5 4 3 2 1 9 8 7\n" +
            "3 2 1 9 8 7 6 5 4\n" +
            "8 9 6 7 4 5 2 1 3\n" +
            "7 4 5 2 1 3 8 9 6\n" +
            "2 1 3 8 9 6 7 4 5\n" +
            "5 7 9 4 6 8 1 3 2\n" +
            "4 6 8 1 3 2 5 7 9\n" +
            "1 3 2 5 7 9 4 6 8"
    val board = input.split('\n').map{ it.split(' ').map{ it.toInt() }.toIntArray()}
    for(x in 0 .. 8) {
        for(y in 0 .. 8) {
            val list = (1..9).toMutableList()
            for(i in 0..8){
                list.remove(board[x][i])
                list.remove(board[i][y])
                list.remove(board[x/3*3 + i/3][y/3*3 + i%3])
            }
            if(list.isEmpty()){
                board[x][y] = 0
            }
        }
    }
    board.forEach{println(it.joinToString(" "))}
}