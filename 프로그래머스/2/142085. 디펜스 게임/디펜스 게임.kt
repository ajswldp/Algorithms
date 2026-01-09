import java.util.PriorityQueue

class Solution {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        var answer: Int = 0
        val pq = PriorityQueue<Int>(Comparator.reverseOrder())
        var num = n
        var count = k
        for(e in enemy){
            pq.add(e)
            num-=e
            while(num < 0){
                if(count == 0){
                    return answer
                }
                val v = pq.poll()
                num+=v
                --count
            }
            answer++
        }
        return answer
    }
}