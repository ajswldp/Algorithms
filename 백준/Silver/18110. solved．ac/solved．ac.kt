import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    if(n == 0){
        print(0)
        return
    }
    var arr = LongArray(n)
    for(i in 0 until n) {
        arr[i] = readLine().toLong()
    }
    arr.sort()
    val p = (arr.size * 15+50)/100
    arr = arr.copyOfRange(p, n-p)
    println((arr.sum()*100000000 / arr.size +50000000)/100000000)
}