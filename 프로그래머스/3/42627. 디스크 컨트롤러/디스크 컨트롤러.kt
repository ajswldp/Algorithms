import java.util.PriorityQueue
import kotlin.comparisons.compareByDescending

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        var answer = 0
        val jopQ = PriorityQueue<Int>(compareBy { jobs[it][0] })
        jopQ.addAll(jobs.indices)
        var t = 0
        val wQ = PriorityQueue<Int>(compareBy { jobs[it][1] })
        while(jopQ.isNotEmpty() || wQ.isNotEmpty()){
            while(jopQ.isNotEmpty() && t >= jobs[jopQ.peek()!!][0]){
                wQ.add(jopQ.poll())
            }
            if(wQ.isEmpty()){
                t = jobs[jopQ.peek()!!][0]
            }
            else{
                val idx = wQ.poll()!!
                t += jobs[idx][1]
                answer += t - jobs[idx][0]
            }
        }
        return answer/jobs.size
    }
}