import kotlin.math.min

class Solution {
    fun solution(cost: Array<IntArray>, hint: Array<IntArray>): Int {
        var min: Int = cost.sumOf { it[0] }
        val hintArr = IntArray(cost.size)
        fun f(idx: Int, sum: Int){
            if(sum >= min)return
            if(idx == hint.size){
                min = min(min, sum + cost[idx][min(hintArr[idx], hint.size)])
                return
            }
            f(idx+1, sum + cost[idx][min(hintArr[idx], hint.size)] )
            for(j in 1 until hint[0].size){
                hintArr[hint[idx][j]-1]++
            }
            f(idx+1, sum + hint[idx][0] + cost[idx][min(hintArr[idx], hint.size)] )
            for(j in 1 until hint[0].size){
                hintArr[hint[idx][j]-1]--
            }
        }
        f(0, 0)
        return min
    }
}