import java.io.*
import java.util.LinkedList

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val list = LinkedList<Long>()
    var time = 0L
    var count = 0L
    for(i in 1..n) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        if(a == 0)count += b
        else if(b!=0){
            list.add(a*100000L+b)
        }
    }
    fun compare(o1:Long, o2:Long):Int{
        val a1 = o1/100000
        val b1 = o1%100000
        val a2 = o2/100000
        val b2 = o2%100000
        return if (b1*a2 == a1*b2) 0
        else if (b1*a2 < a1*b2) -1
        else 1

    }
    list.sortWith(::compare)
    list.forEach {
        val a = it/100000
        val b = it%100000
        time = (time + a*time + b)%40000
    }
    print((time + count) % 40000)
}
