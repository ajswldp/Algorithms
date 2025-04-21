import java.io.*
import java.util.LinkedList

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val inputArr = Array(n){ IntArray(m) }
    val arr = Array(n){ IntArray(m) }
    var q = LinkedList<Int>()
    for(i in 0 until n){
        inputArr[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
        if(inputArr[i].indexOf(2)!=-1){
            q.add(inputArr[i].indexOf(2) + i*m)
        }
    }
    var count = 1
    while(!q.isEmpty()){
        val cq = LinkedList<Int>()
        q.forEach {
            val a = it/m
            val b = it%m
            if(a>0&&inputArr[a-1][b]==1){
                cq.add(it-m)
                arr[a-1][b] = count
                inputArr[a-1][b] = 0
            }
            if(a+1<n&&inputArr[a+1][b]==1){
                cq.add(it+m)
                arr[a+1][b] = count
                inputArr[a+1][b] = 0
            }
            if(b>0&&inputArr[a][b-1]==1){
                cq.add(it-1)
                arr[a][b-1] = count
                inputArr[a][b-1] = 0
            }
            if(b+1<m&&inputArr[a][b+1]==1){
                cq.add(it+1)
                arr[a][b+1] = count
                inputArr[a][b+1] = 0
            }
        }
        q = cq
        count++
    }
    for(i in 0 until n){
        for(j in 0 until m){
            if(inputArr[i][j]==1){
                arr[i][j] = -1
            }
        }
    }
    arr.forEach { println(it.joinToString(" ")) }
}