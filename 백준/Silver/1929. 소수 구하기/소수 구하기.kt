import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map(String::toInt)
    var arr = BooleanArray(m + 1) { true }
    val sb = StringBuilder()
    for (i in 2 ..m){
        if(arr[i]) {
            for (j in i ..m step i) {
                arr[j] = false
            }
            if(i>=n)sb.append("${i}\n")
        }
    }
    println(sb.toString())
}