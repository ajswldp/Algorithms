import kotlin.math.min
class Solution {       
    fun solution(name: String): Int {
        var answer = name.map { min(it.code - 'A'.code, 'A'.code - it.code +26 ) }.sum()
        if(answer == 0) return 0
        val list = mutableListOf<Int>()
        for(i in 0 until name.length){
            if(name[i] != 'A')list.add(i)
        }
        k = name.length
        f(0, list, 0)
        return answer + min
    }

    var k = 0
    var min = Int.MAX_VALUE
    fun f(i: Int, list: MutableList<Int>, count: Int){
        if(count > min)return
        val idx = (i+k)%k
        val list2 = mutableListOf<Int>()
        list2.addAll(list)
        list2.remove(idx)
        if(list2.isEmpty()){
            min = min(count, min)
            return
        }

        f(idx + 1, list2, count+1)
        f(idx - 1, list2, count+1)
    }
}