import kotlin.math.min

class Solution {
    fun solution(storey: Int): Int {
        val map = mutableMapOf<Int, Int>()
        map[storey] = 0
        val q = mutableListOf(storey)
        while(q.isNotEmpty()) {
            val num = q.removeFirst()
            val k = map[num]!!
            if(!map.containsKey(num/10) || map[num/10]!! > k + num%10){
                map[num/10] = k+num%10
                q.add(num/10)
            }
            if(!map.containsKey(num/10+1) || map[num/10+1]!! > k + 10-num%10){
                map[num/10+1] = k + 10-num%10
                q.add(num/10+1)
            }
        }
        return map[0]!!
    }
}