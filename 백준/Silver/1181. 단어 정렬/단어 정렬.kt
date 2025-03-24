import java.util.*
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine().toInt()
    val arr = List<String>(n) { nextLine() }
    arr.toSet().toList().sorted().sortedBy { v -> v.length }.forEach { println(it) }
}