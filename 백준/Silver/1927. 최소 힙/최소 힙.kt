import java.io.*
import java.util.PriorityQueue

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val q = PriorityQueue<Int>()
    val sb = StringBuilder()
    for(i in 0 until n) {
        val input = readLine().toInt()
        if(input==0){
            sb.append(q.poll()?:0)
            sb.append('\n')
        }
        else{
            q.add(input)
        }
    }
    print(sb.toString())
}