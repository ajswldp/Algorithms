import java.util.*

fun main(args: Array<String>)  = with(Scanner(System.`in`)) {
    val n = nextLine().toInt()
    val q = Q<Int>()
    for(i in 0 until n) {
        val input = nextLine()
        if(input == "back"){
            val value = q.back()
            println(value ?: "-1")
        }
        else if(input == "front"){
            val value = q.front()
            println(value ?: "-1")
        }
        else if(input == "empty"){
            println(if(q.empty()) "1" else "0")
        }
        else if(input == "size"){
            println(q.size())
        }
        else if(input == "pop"){
            println(q.pop() ?: "-1")
        }
        else q.push(input.split(" ")[1].toInt())
    }
}
class Q<T>{
    private var front:Node<T>? = null
    private var back:Node<T>? = null

    fun push(value:T){
        val node = Node(value)
        if(front==null){
            front = node
            back = node
        }
        else{
            back!!.next = node
            back = node
        }
    }
    fun pop() :T?{
        if(front == null){
            return null
        }
        if(front == back){
            val value = back!!.data
            front = null
            back = null
            return value
        }
        val value = front!!.data
        front = front!!.next
        return value
    }
    fun size():Int {
        var size = 0
        var node = front
        while(node != null){
            size++
            node = node.next
        }
        return size
    }
    fun empty():Boolean{
        return front == null
    }
    fun front(): T? {
        return front?.data
    }
    fun back(): T? {
        return back?.data
    }
    private data class Node<T>(val value: T){
        var data:T = value
        var next: Node<T>? = null
    }
}