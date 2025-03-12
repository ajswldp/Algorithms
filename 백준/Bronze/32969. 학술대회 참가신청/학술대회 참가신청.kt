import java.util.*
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val input = nextLine().split(' ').toSet()
    val set = hashSetOf<String>("bigdata", "public", "society")
    set.addAll(input)
    if(set.size == input.size+3){
        println("digital humanities")
    }
    else{
        println("public bigdata")
    }
}