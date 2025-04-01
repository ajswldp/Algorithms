
import java.io.*
import java.util.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = ArrayList<CharArray>()
    val n = readLine().split(' ')[0].toInt()
    for(i in 0 until n) {
        arr.add(readLine().toCharArray())
    }
    var count = 1
    var q:Queue<Int> = LinkedList()
    arr[0][0] = '0'
    q.add(0)
    while(q.isNotEmpty()) {
        val nextQ:Queue<Int> = LinkedList()
        while(q.isNotEmpty()) {
            val num = q.remove()
            val x = num % 1000
            val y = num / 1000
            if(x>0&&arr[x-1][y] == '1'){
                nextQ.add(num-1)
                arr[x-1][y] = '0'
            }
            if(y>0&&arr[x][y-1] == '1'){
                nextQ.add(num-1000)
                arr[x][y-1] = '0'
            }
            if(x+1<n&&arr[x+1][y] == '1'){
                nextQ.add(num+1)
                arr[x+1][y] = '0'
            }
            if(y+1<arr[0].size&&arr[x][y+1] == '1'){
                nextQ.add(num+1000)
                arr[x][y+1] = '0'
            }
        }
        count++
        q = nextQ
        if(q.contains(n-1+arr[0].size*1000-1000))break
    }
    println(count)
}