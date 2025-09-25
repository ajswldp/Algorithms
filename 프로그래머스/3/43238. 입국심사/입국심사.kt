class Solution {
    fun solution(n: Int, times: IntArray): Long {
        var min = 0L
        var max = times.minOrNull()!!.toLong() * n
        while(max-1 != min){
            val num = (min + max) / 2
            val sum = times.sumOf { num / it }
            if(sum<n){
                min = num
            }
            else{
                max = num
            }
        }
        return max
    }
}