import java.util.*
fun c(s: String): Int {
    when (s) {
        "black" -> return 0
        "brown" -> return 1
        "red" -> return 2
        "orange" -> return 3
        "yellow" -> return 4
        "green" -> return 5
        "blue" -> return 6
        "violet" -> return 7
        "grey" -> return 8
        "white" -> return 9
    }
    return -1
}
fun f(n: Int): Long {
    var sum = 1L
    for (i in 0 until n) {
        sum*=10
    }
    return sum
}
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val s1 = nextLine()
    val s2 = nextLine()
    val s3 = nextLine()
    var s = ""
    s+=c(s1)
    s+=c(s2)
    print(s.toInt()*f(c(s3)))
}