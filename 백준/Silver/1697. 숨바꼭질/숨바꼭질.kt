import java.io.*
import java.util.LinkedList
import java.util.Queue
import kotlin.math.abs
import kotlin.math.min

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    var min = abs(n-m)
    val q: Queue<List<Int>> = LinkedList()
    q.add(listOf(n, 0))
    val check = BooleanArray(m)
    while(q.isNotEmpty()) {
        val (a, count) = q.poll()
        if(a>=m)min = min(min, count + a-m)
        else if(a<0) continue
        else if(check[a]) continue
        else{
            check[a] = true
            q.add(listOf(a+1, count+1))
            q.add(listOf(a-1, count+1))
            q.add(listOf(a*2, count+1))
        }
    }
    print(min)
}