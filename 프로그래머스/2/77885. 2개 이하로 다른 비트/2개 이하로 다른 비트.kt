class Solution {
    fun solution(numbers: LongArray): LongArray {
        var answer: MutableList<Long> = mutableListOf()
        for(num in numbers){
            val z = num.and(-num-2)+1
            var a = num +z
            if(z > 1)a -= z/2
            answer.add(a)
        }
        return answer.toLongArray()
    }
}