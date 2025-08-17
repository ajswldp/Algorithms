import java.util.LinkedList
class Solution {
    fun solution(s: String): IntArray {
        val str = s.replace("{{", "").replace("}}", "").split("},{").sortedBy { it.length }
        var answer = LinkedList<Int>()
        for(i in str){
            if(!i.contains(',')){
                answer.add(i.toInt())
            }
            else{
                val list = i.split(',').map { it.toInt() }
                answer.addAll(list.filter { !answer.contains(it) })
            }
        }
        return answer.toIntArray()
    }
}