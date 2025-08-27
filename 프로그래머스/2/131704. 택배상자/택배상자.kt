import java.util.LinkedList
import java.util.Stack

class Solution {
    fun solution(order: IntArray): Int {
        var answer: Int = 0
        val stack: Stack<Int> = Stack()
        val list = LinkedList<Int>()
        for(i in 1..order.size){
            list.add(i)
        }
        for(i in order){
            if(stack.isNotEmpty() && stack.peek() == i){
                answer++
                stack.pop()
            }
            else if(list[0] > i){
                break
            }
            else if(list[0] == i){
                answer++
                list.removeFirst()
            }
            else{
                while(list.isNotEmpty() && list[0] < i){
                    stack.push(list.removeFirst())
                }
                if(list.isNotEmpty()) {
                    list.removeFirst()
                    answer++
                }
            }
        }
        return answer
    }
}
