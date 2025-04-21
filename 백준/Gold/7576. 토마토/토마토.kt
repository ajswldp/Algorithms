
import java.io.*
import java.util.LinkedList
import java.util.Queue

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val arr = Array(m){IntArray(n)}
    var q: Queue<Int> = LinkedList()
    var zero = 0
    for(i in arr.indices){
        arr[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
        for(j in 0 until n){
            if(arr[i][j]==1)q.add(i*n+j)
            else if(arr[i][j]==0)zero++
        }
    }
    var time = -1
    while(!q.isEmpty()){
        time++
        val cq: Queue<Int> = LinkedList()
        q.forEach {
            val a = it/n
            val b = it%n
            if(a+1<m&&arr[a+1][b]==0){
                zero--
                arr[a+1][b] = 1
                cq.add(it+n)
            }
            if(a>0&&arr[a-1][b]==0){
                zero--
                arr[a-1][b] = 1
                cq.add(it-n)
            }
            if(b+1<n&&arr[a][b+1]==0){
                zero--
                arr[a][b+1] = 1
                cq.add(it+1)
            }
            if(b>0&&arr[a][b-1]==0){
                zero--
                arr[a][b-1] = 1
                cq.add(it-1)
            }
        }
        q = cq
    }
    print(if(zero==0)time else -1)
}