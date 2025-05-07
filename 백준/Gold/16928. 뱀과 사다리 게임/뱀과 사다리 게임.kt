import java.io.*
import java.util.LinkedList
import java.util.Queue

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = IntArray(101){Integer.MAX_VALUE}
    arr[1] = 0
    var q = LinkedList<Int>()
    q.add(1)
    val n = readLine().split(' ').map(String::toInt).reduce { acc, s -> acc + s }
    val map = HashMap<Int, Int>()
    for(i in 0 until n){
        val (k, v) = readLine().split(' ').map(String::toInt)
        map[k] = v
    }
    var count = 0
    while(!q.contains(100)){
        count++
        val pq = LinkedList<Int>()
        q.forEach {
            val num1 = map[it + 1] ?: (it + 1)
            if(num1<=100&&arr[num1]>count) {
                arr[num1] = count
                pq.add(num1)
            }
            val num2 = map[it + 2] ?: (it + 2)
            if(num2<=100&&arr[num2]>count) {
                arr[num2] = count
                pq.add(num2)
            }
            val num3 = map[it + 3] ?: (it + 3)
            if(num3<=100&&arr[num3]>count) {
                arr[num3] = count
                pq.add(num3)
            }
            val num4 = map[it + 4] ?: (it + 4)
            if(num4<=100&&arr[num4]>count) {
                arr[num4] = count
                pq.add(num4)
            }
            val num5 = map[it + 5] ?: (it + 5)
            if(num5<=100&&arr[num5]>count) {
                arr[num5] = count
                pq.add(num5)
            }
            val num6 = map[it + 6] ?: (it + 6)
            if(num6<=100&&arr[num6]>count) {
                arr[num6] = count
                pq.add(num6)
            }
        }
        q = pq
    }
    print(count)
}