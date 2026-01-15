fun main(){
    data class Road(val s: Int, val e: Int, val length: Int)
    val (k, n) = readln().split(' ').map { it.toInt() }
    val board = IntArray(n+1){index->index}
    val rodes = Array(k){
        val line = readln().split(' ').map { it.toInt() }
        Road(line[0], line[1], line[2])
    }
    rodes.sortBy { it.e }
    for(road in rodes){
        if(road.s > n || road.e > n)continue
        if(board[road.s] + road.length < board[road.e]){
            for(i in 0..n-road.e){
                board[i + road.e] = board[road.s] + road.length + i
            }
        }
    }
    println(board[n])
}