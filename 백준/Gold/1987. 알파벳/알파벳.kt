fun main(){
    val n = readln().split(" ")[0].toInt()
    val board = Array(n){ readln() }
    val flag = BooleanArray(26){ false }
    var max = 1
    fun f(x:Int, y:Int, d:Int = 0){
        if(flag[board[x][y].code - 'A'.code]) return
        flag[board[x][y].code - 'A'.code] = true
        max = maxOf(max, d+1)
        if(x>0)f(x-1, y, d+1)
        if(y>0)f(x, y-1, d+1)
        if(x+1<n)f(x+1, y, d+1)
        if(y+1<board[0].length)f(x, y+1, d+1)
        flag[board[x][y].code - 'A'.code] = false
    }
    f(0, 0)
    println(max)
}