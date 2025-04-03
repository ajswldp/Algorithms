import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = IntArray(10000)
    for(i in 0 until n) {
        arr[readLine().toInt()-1]++
    }
    for(i in 0 until 10000) {
        val sb = StringBuilder()
        for(j in 0 until arr[i]) {
            sb.append("${i+1}\n")
        }
        print(sb)
    }
}