import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toLong()
    val length = readLine().split(' ').map { it.toLong() }
    val city = readLine().split(' ').map { it.toLong() }
    var l = 0L
    var min = city[0]
    var sum = 0L
    for(i in length.indices){
        if(min <= city[i]){
            l += length[i]
            continue
        }
        sum += min * l
        l = length[i]
        min = city[i]
    }
    print( sum + min * l)
}