class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer = s.toCharArray()
        for(i in answer.indices){
            var count = 0
            while (count < index){
                answer[i] = ((answer[i].code-'a'.code+1)%26+'a'.code).toChar()
                if(!skip.contains(answer[i]))count++
            }
        }
        return answer.joinToString("")
    }
}

