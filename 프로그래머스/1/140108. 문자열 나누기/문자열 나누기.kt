class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var char = '-'
        var a = 0
        var b = 0
        for(i in s.indices){
            if(a==b){
                char = s[i]
                answer++
            }
            if(char==s[i])a++ else b++
        }
        return answer
    }
}