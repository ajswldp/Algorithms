class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        fun sum(start: Int, end: Int): Int {
            var sum = 0
            for(i in start until end) {
                sum += sequence[i]
            }
            return sum
        }
        var answer = IntArray(2)
        var max = sequence.size
        var len = 1
        fun findLen(): Boolean {
            while (true) {
                val sum = sum(max - len, max)
                if (sum > k)return false
                if (sum == k)return true
                len += (k - sum + sequence[max - 1 - len] - 1) / sequence[max - 1 - len]
            }
        }
        fun findMax(): Boolean {
            var sum = sum(max - len, max)
            while (sum > k) {
                sum -= sequence[max-1]
                max--
                sum += sequence[max-len]
            }
            if(sum<k)return false
            else return true
        }
        while(true){
            val lenOk = findLen()
            val maxOk = findMax()
            if(lenOk && maxOk) break
        }
        if(max!=len && sequence[max-len-1] == sequence[max-1]){
            var min1 = -1
            var max1 = max-len
            while(min1+1!=max1){
                if(sequence[(min1+max1)/2] == sequence[max-1]){
                    max1 = (min1+max1)/2
                }
                else{
                    min1 = (min1+max1)/2
                }
            }
            max -= max-len - max1
        }
        answer[0] = max-len
        answer[1] = max-1
        return answer
    }
}