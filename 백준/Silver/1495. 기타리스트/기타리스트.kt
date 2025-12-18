fun main(){
    val (n, s, m) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    val board = Array(n + 1) { mutableSetOf<Int>() }
    board[0].add(s)
    for(i in 0 until n){
        for(num in board[i]){
            if(num + list[i] <= m) board[i + 1].add(num + list[i])
            if(num - list[i] >= 0) board[i + 1].add(num - list[i])
        }
    }
    board[n].add(-1)
    println(board[n].max())
}