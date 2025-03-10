import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    var num1 = a
    var num2 = b
    while(num1%num2!=0){
        val tamp = num1%num2
        num1 = num2
        num2 = tamp
    }
    println(num2)
    println(a*b/num2)
}