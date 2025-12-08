class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        val arr = IntArray(y+1){Int.MAX_VALUE}
        arr[x] = 0
        for(i in x..y){
            if(i-n>0 && arr[i-n] != Int.MAX_VALUE) arr[i] = arr[i-n] + 1
            if(i%2 == 0 && arr[i/2] != Int.MAX_VALUE) arr[i] = minOf(arr[i], arr[i/2] + 1)
            if(i%3 == 0 && arr[i/3] != Int.MAX_VALUE) arr[i] = minOf(arr[i], arr[i/3] + 1)
        }
        return if(arr[y] == Int.MAX_VALUE) -1 else arr[y]
    }
}