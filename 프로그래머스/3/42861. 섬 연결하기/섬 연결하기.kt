import java.util.PriorityQueue
class Solution {
    fun solution(n: Int, costs: Array<IntArray>): Int {
        var answer = 0
        val arr = Array(n){ mutableListOf<Int>() }
        for(i in costs.indices){
            arr[costs[i][0]].add(i)
            arr[costs[i][1]].add(i)
        }
        val boolArr = BooleanArray(n){false}
        boolArr[0] = true
        val q = PriorityQueue<IntArray>{a, b -> a[2] - b[2] }
        arr[0].forEach{q.add(costs[it])}
        while(!q.isEmpty()){
            val cost = q.poll()
            if(boolArr[cost[0]] && boolArr[cost[1]])continue
            boolArr[cost[0]] = true
            boolArr[cost[1]] = true
            answer += cost[2]
            arr[cost[0]].forEach{q.add(costs[it])}
            arr[cost[1]].forEach{q.add(costs[it])}
        }
        return answer
    }
}