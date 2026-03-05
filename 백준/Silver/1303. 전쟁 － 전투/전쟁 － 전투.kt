fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val board = Array(m){readln().toCharArray()}
    var b = 0
    var w = 0
    fun f(x:Int, y:Int):Int{
        if(board[x][y] == 'x') return 0
        var sum = 1
        val c = board[x][y]
        board[x][y] = 'x'
        if(x+1<board.size && board[x+1][y] == c) sum+=f(x+1, y)
        if(y+1<board[0].size && board[x][y+1] == c) sum+=f(x, y+1)
        if(x>0 && board[x-1][y] == c) sum+=f(x-1, y)
        if(y>0 && board[x][y-1] == c) sum+=f(x, y-1)
        return sum
    }
    for(i in 0 until m){
        for(j in 0 until n){
            if(board[i][j] == 'W') {
                val sum = f(i, j)
                w += sum*sum
            }
            if(board[i][j] == 'B') {
                val sum = f(i, j)
                b += sum*sum
            }
        }
    }
    println("$w $b")
}