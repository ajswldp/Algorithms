fun main(){
    val b = readln().split(" ")[1].toLong()
    val list = readln().split(" ").map { it.toLong() }
    print(if(list.sum() - list.size >= b)"DIMI" else "OUT")
}