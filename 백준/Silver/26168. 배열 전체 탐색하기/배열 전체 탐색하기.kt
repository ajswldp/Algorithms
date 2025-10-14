import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val m = readLine().split(" ").map { it.toLong() }[1]
    val arr = readLine().split(" ").map { it.toLong() }.sortedDescending().toLongArray()
    for(i in 0 until m){
        val commend = readLine().split(" ").map { it.toLong() }
        println(
            when(commend[0]){
                1L -> f1(commend[1], arr)
                2L -> f2(commend[1], arr)
                3L -> f3(commend[1], commend[2], arr)
                else -> throw RuntimeException()
            }
        )
    }
}
fun f1(k: Long, arr: LongArray): Int {
    if(arr[0] < k)return 0
    if(arr[arr.size - 1] >= k) return arr.size
    var min = 0
    var max = arr.size - 1
    while(min != max){
        val num = (max + min) / 2
        if(arr[num] >= k){
            min = num + 1
        }
        else{
            max = num
        }
    }
    return min
}
fun f2(k: Long, arr: LongArray): Int {
    if(arr[0] <= k)return 0
    if(arr[arr.size - 1] > k) return arr.size
    var min = 0
    var max = arr.size - 1
    while(min != max){
        val num = (max + min) / 2
        if(arr[num] > k){
            min = num + 1
        }
        else{
            max = num
        }
    }
    return min
}
fun f3(a: Long, b:Long, arr: LongArray): Int {
    val r = f1(a,arr)
    if(r == 0)return 0
    if(arr[r - 1] > b) return 0
    var min = 0
    var max = r
    while(min != max){
        val num = (max + min) / 2
        if(arr[num] > b){
            min = num + 1
        }
        else{
            max = num
        }
    }
    return r - min
}