fun main(){
    val n = readln().toInt()
    val board = Array(100001) { LongArray(3) }
    board[0][1] = 1
    board[1][0] = 1
    board[2][1] = 1
    var idx = 2
    for(t in 1..n){
        val input = readln().toInt()
        while(idx < input){
            idx++
            board[idx][0] = board[idx-1][1] + board[idx-1][2] % 1000000009
            board[idx][1] = board[idx-2][0] + board[idx-2][2] % 1000000009
            board[idx][2] = board[idx-3][0] + board[idx-3][1] % 1000000009
        }
        println(board[input].sum()% 1000000009)
    }
}