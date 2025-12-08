import java.util.TreeSet

class Solution {
    fun solution(word: String): Int {
        val set = TreeSet<String>()
        f(set, "")
        return set.toMutableList().indexOf(word)
    }
    fun f(set: TreeSet<String>, s: String){
        if(s.length > 5)return
        set.add(s)
        f(set, s+"A")
        f(set, s+"E")
        f(set, s+"I")
        f(set, s+"O")
        f(set, s+"U")
    }
}