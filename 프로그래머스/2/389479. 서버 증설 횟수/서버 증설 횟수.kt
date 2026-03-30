import java.util.LinkedList

class Solution {
    fun solution(players: IntArray, m: Int, k: Int): Int {
        var answer: Int = 0
        val list = LinkedList<Int>()
        
        for(i in players.indices){
            while( list.isNotEmpty() && list.first() + k <= i)list.removeFirst()
            while(players[i]/m > list.size){
                list.add(i)
                answer++
            }
        }
        return answer
    }
}