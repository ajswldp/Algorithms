import java.util.PriorityQueue
import kotlin.math.min

fun main(){
    val (n, m) = readln().split(" ").map(String::toInt)
    val board = (1..n).map { mutableListOf<Pair<Int, Int>>() }
    for(i in 1..m){
        val (a, b, c) = readln().split(" ").map(String::toInt)
        board[a-1].add(Pair(b-1, c))
        board[b-1].add(Pair(a-1, c))
    }
    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
    board[0].forEach { pq.add(it) }
    val visited = BooleanArray(n)
    while(true){
        val p = pq.poll()
        if(p.first == n-1){
            println(p.second)
            return
        }
        if(visited[p.first])continue
        visited[p.first] = true
        board[p.first].forEach {
            pq.add(Pair(it.first, it.second + p.second))
        }
    }
}