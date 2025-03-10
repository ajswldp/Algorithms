import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = nextInt()
    }
    print(arr.reduce(Int::plus).toDouble()/arr.max()*100/n)
}