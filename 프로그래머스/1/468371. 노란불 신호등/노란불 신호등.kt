class Solution {
    fun solution(signals: Array<IntArray>): Int {
        for(i in 0..1600000){
            if(signals.all{f(i, it)}) return i
        }
        return -1
    }
    fun f(time:Int, signal:IntArray): Boolean{
        val num = time%(signal.sum())
        return num>signal[0] && num <= signal[0]+ signal[1]
    }
}