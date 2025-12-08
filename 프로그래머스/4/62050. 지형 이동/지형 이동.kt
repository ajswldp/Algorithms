import java.util.PriorityQueue
import kotlin.math.abs

class Solution {
    fun solution(land: Array<IntArray>, height: Int): Int {
        var answer = 0
        val board = Array(land.size){BooleanArray(land[0].size)}
        val pq = PriorityQueue<Pair<Int, Pair<Int, Int>>>({ a, b -> a.first - b.first})
        pq.add(Pair(0, Pair(0,0)))
        while(!pq.isEmpty()){
            val (num, xy) = pq.poll()
            if(board[xy.first][xy.second])continue
            else if(num <= height)board[xy.first][xy.second] = true
            else{
                answer+= num
            }
            f(board, pq, xy, land)
        }
        return answer
    }
    fun f(board: Array<BooleanArray>, pq: PriorityQueue<Pair<Int, Pair<Int, Int>>>, xy: Pair<Int, Int>, land: Array<IntArray>){
        val (x, y) = xy
        board[x][y] = true
        val num = land[x][y]
        if(x>0) pq.add(Pair(abs(land[x-1][y] - num), Pair(x-1, y)))
        if(y>0) pq.add(Pair(abs(land[x][y-1] - num), Pair(x, y-1)))
        if(x<land.size-1) pq.add(Pair(abs(land[x+1][y] - num), Pair(x+1, y)))
        if(y<land[0].size-1) pq.add(Pair(abs(land[x][y+1] - num), Pair(x, y+1)))
    }
}