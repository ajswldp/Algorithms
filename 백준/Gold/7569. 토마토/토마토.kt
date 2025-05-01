import java.io.*
import java.util.LinkedList
import java.util.Queue

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m, l) = readLine().split(' ').map(String::toInt)
    val list = ArrayList<MutableList<MutableList<Int>>>()
    var q: Queue<List<Int>> = LinkedList()
    var count = n*m*l
    for(i in 0 until l){
        list.add(ArrayList())
        for(j in 0 until m){
            list[i].add(readLine().split(' ').map(String::toInt).toMutableList())
            list[i][j].forEachIndexed { index, num ->
                if(num != 0){
                    count--
                    if(num == 1){
                        q.add(listOf(i, j, index))
                    }
                }
            }
        }
    }
    var time = -1
    while(q.isNotEmpty()){
        val cq: Queue<List<Int>> = LinkedList()
        time++
        q.forEach {
            val (a, b, c) = it
            if(a+1 < l && list[a+1][b][c] == 0){
                count--
                list[a+1][b][c] = 1
                cq.add(listOf(a+1, b, c))
            }
            if(a-1 >= 0 && list[a-1][b][c] == 0){
                count--
                list[a-1][b][c] = 1
                cq.add(listOf(a-1, b, c))
            }
            if(b+1 < m && list[a][b+1][c] == 0){
                count--
                list[a][b+1][c] = 1
                cq.add(listOf(a, b+1, c))
            }
            if(b-1 >= 0 && list[a][b-1][c] == 0){
                count--
                list[a][b-1][c] = 1
                cq.add(listOf(a, b-1, c))
            }
            if(c+1 < n && list[a][b][c+1] == 0){
                count--
                list[a][b][c+1] = 1
                cq.add(listOf(a, b, c+1))
            }
            if(c-1 >= 0 && list[a][b][c-1] == 0){
                count--
                list[a][b][c-1] = 1
                cq.add(listOf(a, b, c-1))
            }
        }
        q = cq
    }
    if(count != 0){
        print(-1)
    }
    else{
        print(time)
    }
}