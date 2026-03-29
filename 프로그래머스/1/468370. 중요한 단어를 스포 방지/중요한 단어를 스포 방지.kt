class Solution {
    fun solution(message: String, spoiler_ranges: Array<IntArray>): Int {
        var answer: Int = 0
        val word = message.split(" ").map { Pair(it, false) }.toTypedArray()
        for (spoilerRange in spoiler_ranges) {
            val (s, e) = spoilerRange
            var count = 0
            var idx = 0
            while(count <= e){
                if(count + word[idx].first.length > s) word[idx] = Pair(word[idx].first, true)
                count += word[idx].first.length + 1
                idx++
            }
        }
        val map = mutableMapOf<String, Boolean>()
        word.filter { !it.second }.forEach { map[it.first] = it.second }
        word.filter { it.second }.forEach {
            if(!map.containsKey(it.first)){
                answer++
                map[it.first] = true
            }
        }
        return answer
    }
}