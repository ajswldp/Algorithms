import java.util.*

fun main(args: Array<String>)  = with(Scanner(System.`in`)) {
    val n = nextInt()
    val arr = IntArray(n)
    for(i in arr.indices) {
        arr[i] = nextInt()
    }
    f(0, n-1, arr)
    println(arr.joinToString("\n"))
}
fun f(stat:Int, end:Int, arr:IntArray){
    if(stat >= end) return
    var pivot = stat
    var l = stat+1
    var r = end
    while(l <= r){
        val temp = arr[l]
        arr[l] = arr[r]
        arr[r] = temp
        while(l<arr.size&&arr[l] <= arr[pivot]){l++}
        while(arr[r] > arr[pivot]){r--}
    }
    val temp = arr[r]
    arr[r] = arr[pivot]
    arr[pivot] = temp
    f(stat, r-1, arr)
    f(r+1, end, arr)
}