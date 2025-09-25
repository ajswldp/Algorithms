class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        for(s in babbling){
            var word = "a"
            var idx = 0
            while(true){
                if(word != "aya" && f(s, idx, "aya")){
                    word = "aya"
                    idx += word.length
                }
                else if(word != "ye" && f(s, idx, "ye")){
                    word = "ye"
                    idx += word.length
                }
                else if(word != "woo" && f(s, idx, "woo")){
                    word = "woo"
                    idx += word.length
                }
                else if(word != "ma" && f(s, idx, "ma")){
                    word = "ma"
                    idx += word.length
                }
                else {
                    if(idx == s.length){
                        answer++
                    }
                    break
                }
            }
        }
        return answer
    }
    fun f(s1: String, idx: Int, s2: String): Boolean{
        try{
            for(i in s2.indices){
                if(s1[idx+i] != s2[i]) return false
            }
            return true
        }catch (e: Exception){
            return false
        }
    }
}