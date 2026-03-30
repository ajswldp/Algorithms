import java.util.LinkedList

fun main(){
    val (n, k) = readln().split(" ").map(String::toInt)
    val arr = readln().split(" ").map(String::toInt)
    val list = LinkedList<Int>()
    fun windowAdd(v: Int) {
        while( !list.isEmpty() && list.last() > v )list.removeLast()
        list.addLast(v)
    }
    fun windowPop(v: Int) {
        if(list.first() == v)list.removeFirst()
    }
    for(i in 0 until k){
        windowAdd(arr[i])
    }
    var max = list.first()
    for(i in 0 until n - k){
        windowAdd(arr[i + k])
        windowPop(arr[i])
        max = maxOf(max, list.first())
    }
    println(max)
}