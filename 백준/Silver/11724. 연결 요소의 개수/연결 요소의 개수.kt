import java.io.*
import java.util.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    val arr = Array(n+1){BooleanArray(n+1)}
    val check = BooleanArray(n+1){true}
    for(i in 0 until m){
        val (a, b) = readLine().split(' ').map(String::toInt)
        arr[a][b] = true
        arr[b][a] = true
    }
    var count = 0
    for(i in 1..n){
        if(check[i]){
            count++
            val q: Queue<Int> = LinkedList()
            q.add(i)
            check[i] = false
            while(q.isNotEmpty()){
                val node = q.remove()
                for(j in 1..n){
                    if(arr[node][j]&&check[j]){
                        arr[node][j] = false
                        arr[j][node] = false
                        check[j] = false
                        q.add(j)
                    }
                }
            }
        }
    }
    print(count)
}