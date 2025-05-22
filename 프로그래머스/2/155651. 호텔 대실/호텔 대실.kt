import java.util.PriorityQueue

class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        var answer: Int = 0
        val sortedTime = book_time.sortedBy { it[0] }
        val q = PriorityQueue<Array<String>>(){a,b->a[1].compareTo(b[1])}
        for (time in sortedTime) {
            
            q.add(time)
            val (h1, m1) = time[0].split(":").map { it.toInt() }
            var (h2, m2) = q.peek()[1].split(":").map { it.toInt() }
            while(h1*60+m1 >= h2*60+m2+10){
                q.poll()
                val (a, b) = q.peek()[1].split(":").map { it.toInt() }
                h2 = a
                m2 = b
            }
            if(q.size > answer) answer++
        }
        return answer
    }
}