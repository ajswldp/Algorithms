import java.io.*
import java.util.LinkedList

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    for(i in 0 until n) {
        var idx = -1
        var count = 0
        val arr = Array(10) { LinkedList<Int>() }
        val (m, k) = readLine().split(' ').map { it.toInt() }
        val input = readLine().split(' ').map { it.toInt() }
        for(i in 0 until m) {
            arr[input[i]].add(i)
        }
        var i = 9
        while(true){
            val sortedArr = arr[i--].sortedBy{ if (it > idx) it else it + 1000 }
            if(sortedArr.isEmpty()) continue
            idx = sortedArr.last()
            if(sortedArr.contains(k)){
                count += sortedArr.indexOf(k) + 1
                break
            }
            else{
                count += sortedArr.size
            }
        }
        println(count)
    }
}