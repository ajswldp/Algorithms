fun main(){
    val n = readln().toInt()
    while(true){
        println("? $n")
        val line = readln()
        if(line == "Y"){
            println("! $n")
            return
        }
    }
}