import kotlin.math.abs

class Solution {
    fun solution(sequence: IntArray): Long {
        var max = 0L
        var minSum = 0L
        var maxSum = 0L
        for(i in sequence.indices){
            if(i%2 == 0)sequence[i] = -sequence[i]
            minSum += sequence[i]
            maxSum += sequence[i]
            if(minSum >= 0)minSum = 0
            if(maxSum <= 0)maxSum = 0
            max = maxOf(max, -minSum, maxSum)
        }
        return max
    }
}