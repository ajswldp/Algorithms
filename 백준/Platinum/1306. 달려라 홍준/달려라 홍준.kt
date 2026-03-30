import java.util.LinkedList

fun main(){
    val (n, k) = readln().split(" ").map(String::toInt)
    val arr = readln().split(" ").map(String::toInt)
    val list = LinkedList<Int>()
    val sb = StringBuilder()
    fun windowAdd(v: Int) {
        while( !list.isEmpty() && list.last() < v )list.removeLast()
        list.addLast(v)
    }
    fun windowPop(v: Int) {
        if(list.first() == v)list.removeFirst()
    }
    for(i in 0 until k*2-1){
        windowAdd(arr[i])
    }
    sb.append(list.first())
    for(i in 0 .. n - k * 2){
        windowAdd(arr[i + k * 2 - 1])
        windowPop(arr[i])
        sb.append(' ')
        sb.append(list.first())
    }
    println(sb.toString())
}