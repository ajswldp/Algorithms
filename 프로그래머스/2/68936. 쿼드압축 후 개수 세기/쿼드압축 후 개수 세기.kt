class Solution {
    fun solution(arr: Array<IntArray>): IntArray {
        var one = 0
        var zero = 0
        fun f(x: Int, y: Int, len:Int): Int {
            if(len != 1){
                val arr2 = IntArray(4)
                arr2[0] = f(x, y, len/2)
                arr2[1] = f(x+len/2, y, len/2)
                arr2[2] = f(x, y+len/2, len/2)
                arr2[3] = f(x+len/2, y+len/2, len/2)
                if(arr2.all { it == arr2[0] })return arr2[0]
                else{
                    arr2.forEach {
                        if(it == 1)one++
                        else if(it == 0)zero++
                    }
                    return -1
                }
            }
            return arr[x][y]
        }
        f(0, 0, arr.size)
        if(zero == 0 && one == 0){
            if(arr[0][0] == 0)zero++
            else one++
        }
        val ans = IntArray(2)
        ans[0] = zero
        ans[1] = one
        return ans
    }
}