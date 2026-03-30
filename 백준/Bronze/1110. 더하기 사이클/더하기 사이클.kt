import java.util.*
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val num = nextInt()
    var a = num/10
    var b = num%10
    var count = 0
    do {
        count++
        b = (a+b)%10
        a = (b+10-a)%10
    }while (a*10+b!=num)
    println(count)
}