import java.util.*
var k=0
fun main()  = with(Scanner(System.`in`)) {
    val arr = IntArray(nextInt())
    k = nextInt()
    for (i in arr.indices) {
        arr[i] = nextInt()
    }
    merge_sort(arr, 0, arr.size - 1)
    if(k>0){
        println(-1)
    }
}
fun merge_sort(arr: IntArray, p:Int, r:Int) {
    if(k<0)return
    if(p < r){
        val q = (p+r)/2
        merge_sort(arr, p, q)
        merge_sort(arr, q+1, r)
        merge(arr, p, q, r);
    }
}
fun merge(arr: IntArray, p: Int, q:Int, r:Int){
    if(k<0)return
    var i = p
    var j = q+1
    var t = 0
    val temp = IntArray(r-p+1)
    while(i <= q && j <= r){
        if(arr[i] <= arr[j]){
            temp[t++] = arr[i++]
        }
        else{
            temp[t++] = arr[j++]
        }
    }
    while(i <= q){
        temp[t++] = arr[i++]
    }
    while(j <= r){
        temp[t++] = arr[j++]
    }
    i = p
    t = 0
    while(i <= r){
        k--
        if(k == 0){
            println(temp[t])
            return
        }
        arr[i++] = temp[t++]
    }
}