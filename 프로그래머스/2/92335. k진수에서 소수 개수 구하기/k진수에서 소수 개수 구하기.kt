import java.math.BigInteger
class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer = 0
        val sList = n.toString(k).split('0').filter { it != "" && it != "1" }
        if(sList.isEmpty())return 0
        val list = sList.map{ it.toLong() }.sorted().toMutableList()
        list.forEach { if(BigInteger.valueOf(it).isProbablePrime(20))answer++ }
        return answer
    }
}