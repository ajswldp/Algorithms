import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    val k = nextInt()
    val queue = LinkedList<Int>()
    for (i in 1..n) {
        queue.add(i)
    }
    val list = LinkedList<Int>()
    while (!queue.isEmpty()) {
        for(i in 1 until k) {
            queue.add(queue.poll())
        }
        list.add(queue.poll())
    }
    println("<"+list.toString().substring(1, list.toString().length - 1)+">")
}