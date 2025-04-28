import java.io.*
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue
import kotlin.math.abs
import kotlin.math.sqrt

val map = HashMap<String, Int>()
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()
    val q = PriorityQueue<Int> {o1, o2 -> (abs(o1) - abs(o2))*10 + if(o1 < 0) -1 else 1 }

    for(i in 0 until n) {
        val input = readLine().toInt()
        if(input==0){
            println(if(q.isEmpty()) 0 else q.poll())
        }
        else{
            q.add(input)
        }
    }
}