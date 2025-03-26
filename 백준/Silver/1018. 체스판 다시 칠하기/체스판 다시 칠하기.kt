import java.io.*
import java.util.*
import kotlin.math.min

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (h, w) = readLine().split(" ").map(String::toInt)
    val input = ArrayList<String>()
    for(i in 0 until h) {
        input.add(readLine())
    }
    var min = Int.MAX_VALUE
    for(i in 0 until h-7) {
        for(j in 0 until w-7) {
            min = min(min, f(input, j, i))
        }
    }
    println(min)
}
fun f(arr: ArrayList<String>, sw: Int, sh: Int): Int {
    var count = 0
    for(i in sh until sh+8){
        for(j in sw until sw+8){
            if(if((i+j)%2 == 0)arr[i][j] == 'W' else arr[i][j] == 'B'){
                count++
            }
        }
    }
    return min(count, 64-count)
}