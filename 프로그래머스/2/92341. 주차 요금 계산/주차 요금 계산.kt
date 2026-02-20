import java.util.TreeMap

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val map = mutableMapOf<Int, Int>()
        val fee = TreeMap<Int, Int>()
        for(r in records){
            val input = r.split(" ")
            val time = input[0].split(":")[0].toInt()*60+input[0].split(":")[1].toInt()
            val number = input[1].toInt()
            if(input[2] == "IN"){
                map[number] = time
            }
            else{
                val bf = map.remove(number)!!
                if(fee.contains(number)){
                    fee[number] = fee[number]!! + time - bf
                }
                else{
                    fee[number] = time - bf
                }
            }
        }
        for(k in map.keys){
            val time = 24*60-1
            if(fee.contains(k)){
                fee[k] = fee[k]!! + time - map[k]!!
            }
            else{
                fee[k] = time - map[k]!!
            }
        }
        val ans = IntArray(fee.size)
        for(i in fee.values.indices){
            ans[i] = fees[1]
            if(fee.values.toList()[i] > fees[0]){
                ans[i]+=(fee.values.toList()[i]-fees[0]+fees[2]-1)/fees[2]*fees[3]
            }
        }
        return ans
    }
}