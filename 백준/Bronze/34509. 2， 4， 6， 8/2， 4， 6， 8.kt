fun main(){
    var list = (10..99).toList()
    list = list.filter { (it/10 + it%10*10) % 4 == 0 }
    list = list.filter { (it%10 + it/10) % 6 == 0 }
    list = list.filter { it%10 != 8 && it/10 != 8 }
    println(list[0])
}