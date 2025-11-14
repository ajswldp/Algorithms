import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (input, n) = readLine().split(" ").map { it.toInt() }
    if(n > 0){
        print(input.toString(n))
        return
    }
    if(input == 0){
        print(0)
        return
    }
    var s = ""
    var num = input
    var isMinus = false
    var pn = -n
    while (num != 0) {
        var a = 0
        if(isMinus){
            while((num+a)%pn != 0)a++
            s = a.toString() + s
            num += a
        }
        else{
            while((num-a)%pn != 0)a++
            s = a.toString() + s
            num -= a
        }
        isMinus = !isMinus
        num/=pn
    }
    println(s)
}