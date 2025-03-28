import java.io.*
import kotlin.math.pow

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val line = readLine()
        if (line == null) break
        val s = CharArray(3.0.pow(line.toDouble()).toInt())
        f(s, 0, s.size, false)
        println(s.joinToString(""))
    }
}
fun f(s: CharArray, i:Int, k: Int, isBlank:Boolean) {
    if(isBlank){
        for(j in i until i + k){
            s[j] = ' '
        }
    }
    else if(k == 1)s[i] = '-'
    else{
        f(s, i, k/3, false)
        f(s, i+k/3, k/3, true)
        f(s, i+k/3*2, k/3, false)
    }
}