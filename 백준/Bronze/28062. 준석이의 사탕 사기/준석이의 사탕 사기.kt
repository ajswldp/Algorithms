import java.util.*
fun main()  = with(Scanner(System.`in`)) {
    nextLine()
    val arr = nextLine().split(" ").map { it.toInt() }
    println(if(arr.sum()%2 == 0)arr.sum() else arr.sum() - arr.minBy {if(it%2 == 1)it else 1000})
}