import kotlin.math.min

fun main(){
    val (n,m) = readln().split(" ").map { it.toInt() }
    fun f(s:String, a:Int){
        if(s.length==m*2)println(s)
        else{
            for(i in a+1..n){
                f("$s$i ", i)
            }
        }
    }
    f("", 0)
}