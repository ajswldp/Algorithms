import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var (h, m) = readLine().split(' ').map { it.toInt() }
    m += readLine().toInt()
    if(m >= 60){
        h += m/60
        m %= 60
        if(h>=24){
            h %= 24
        }
    }
    print("$h $m")
}