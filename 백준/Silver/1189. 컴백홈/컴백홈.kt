fun main(){
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val board = Array(n){readln().toCharArray()}
    var count = 0
    fun f(x:Int, y:Int, d:Int = 1){
        if(x == 0 && y == m-1){
            if(d==k) count++
            return
        }
        if( d>k || board[x][y] != '.')return
        board[x][y] = 'X'

        if(x>0)f(x-1, y, d+1)
        if(y>0)f(x, y-1, d+1)
        if(x< n-1)f(x+1, y, d+1)
        if(y< m-1)f(x, y+1, d+1)
        board[x][y] = '.'
    }
    f(n-1, 0)
    println(count)
}