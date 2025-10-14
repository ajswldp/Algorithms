import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var s1 = f(readLine().split(":").map { it.toInt() })
    var s2 = f(readLine().split(":").map { it.toInt() })
    val t1 = f(readLine().split(":").map { it.toInt() })
    val t2 = f(readLine().split(":").map { it.toInt() })
    while(s1!=s2){
        if(s1<s2)s1+=t1
        if(s1>s2)s2+=t2
        if(s1>24*24*60*60*100){
            print("Never")
            return
        }
    }
    when (s1/(60*24)%7){
        0 -> println("Saturday")
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
    }
    print("%02d:%02d".format(s1%(60*24)/60, s1%(60*24)%60))
}
fun f(list: List<Int>):Int{
    return list[0] * 60 + list[1]
}