import java.util.LinkedList

class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val q1 = LinkedList(queue1.toList())
        var sum1 = q1.sumOf { it.toLong() }
        val q2 = LinkedList(queue2.toList())
        var sum2 = q2.sumOf { it.toLong() }
        var ans = 0
        while(ans <= queue1.size + queue2.size) {
            while(sum1<sum2){
                val num = q2.removeFirst()
                sum2 -= num
                q1.add(num)
                sum1 += num
                ans++
            }
            while(sum2<sum1){
                val num = q1.removeFirst()
                sum1 -= num
                q2.add(num)
                sum2 += num
                ans++
            }
            if(sum1==sum2){
                return ans
            }
        }
        return -1
    }
}