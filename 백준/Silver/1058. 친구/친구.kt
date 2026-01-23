fun main(){
    val n = readln().toInt()
    val board = Array(n){ readln() }
    var max = 0
    for(i in board.indices){
        val set = mutableSetOf<Int>()
        for(j in board.indices){
            if(board[i][j] == 'Y'){
                set.add(j)
                for(k in board.indices){
                    if(board[j][k] == 'Y'){
                        set.add(k)
                    }
                }
            }
        }
        if(max < set.size)max = set.size-1
    }
    println(max)
}