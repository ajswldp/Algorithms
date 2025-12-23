class Solution {
    fun solution(distance: Int, rocks: IntArray, n: Int): Int {
        val r = rocks.sorted().toMutableList()
        r.add(distance)
        for(i in rocks.size - 1 downTo 0) r[i + 1] -= r[i]
        var k = 1000000000
        var ans = 0
        while(true){
            //println("k = $k, ans = $ans")
            if(isOk(r, n, k+ans)){
                ans += k
                k=(k+1)/2
            }
            else {
                if(isOk(r, n, k+ans - 1)) return ans + k - 1
                k=(k+1)/2
            }
            //if(k == 1)return -1
        }
    }
}
fun isOk(r: MutableList<Int>, n:Int, k:Int): Boolean{
    //println("isok: n = $n, k = $k, r = [${r.joinToString(" ")}]")
    var idx = 0
    var count = 0
    while(idx < r.size){
        var num = r[idx]
        var j = 1
        while(num < k){
            count++
            if(count > n) return false
            if(idx + j >= r.size) return true
            num+=r[idx + j++]
        }
        idx+=j
    }
    return true
}