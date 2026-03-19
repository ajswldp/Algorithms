import java.util.PriorityQueue

fun main(){
    val n = readln().toInt()
    val m = readln().toInt()
    val arr = IntArray(n + 1) { it }
    val pq = PriorityQueue<Triple<Int, Int, Int>>(compareBy { it.third })
    for(i in 0 until m){
        val input = readln().split(" ").map { it.toInt() }
        pq.add(Triple(input[0], input[1], input[2]))
    }
    fun find(a:Int): Int{
        if(a == arr[a]) return a
        find(arr[a])
        arr[a] = arr[arr[a]]
        return arr[a]
    }
    var sum = 0
    while(pq.isNotEmpty()){
        val triple = pq.poll()
        val a = find(triple.first)
        val b = find(triple.second)
        if(a!=b){
            arr[b] = a
            sum += triple.third
        }
    }
    println(sum)
}