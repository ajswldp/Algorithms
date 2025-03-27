
import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = MyLinkedList<Char>()
    val arr = readLine().toCharArray()
    for(c in arr){
        list.insert(c)
    }
    val n = readLine().toInt()
    for(i in 0 until n){
        val input = readLine()
        when(input[0]){
            'P' -> list.insert(input[2])
            'L' -> list.l()
            'D' -> list.d()
            'B' -> list.delete()
        }
    }
    println(list.join(""))
}
class MyLinkedList<T>{

    var head:Node<T>? = null
    var size = 0
    var cursor:Node<T>? = null

    fun insert(value:T){
        if(head==null){
            head = Node(value)
            cursor = head
        }
        else if(cursor==null){
            cursor = Node(value)
            cursor!!.r = head
            head!!.l = cursor
            head = cursor
        }
        else {
            val node = Node(value)
            node.l = cursor
            node.r = cursor!!.r
            cursor!!.r = node
            node.r?.l = node
            cursor = node
        }
    }
    fun delete(){
        if(cursor==null){
            return
        }
        if(cursor == head){
            head = head!!.r
            head?.l = null
            cursor = null
        }
        else{
            cursor!!.l!!.r = cursor!!.r
            cursor!!.r?.l = cursor!!.l
            cursor = cursor!!.l
        }
    }
    fun l(){
        cursor = cursor?.l
    }
    fun d(){
        if(cursor==null){
            cursor = head
        }
        else if(cursor!!.r!=null){
            cursor = cursor!!.r
        }
    }

    fun join(s:String): String {
        if(head==null){
            return s
        }
        val sb = StringBuilder(head!!.data.toString())
        var node = head!!.r
        while(node != null){
            sb.append(s)
            sb.append(node.data.toString())
            node = node.r
        }
        return sb.toString()
    }

    class Node<T>(val data: T){
        var l:Node<T>? = null
        var r:Node<T>? = null
    }
}