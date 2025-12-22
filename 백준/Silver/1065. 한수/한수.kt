import java.util.TreeSet

fun main(){
    val arr = TreeSet<Int>()
    f(arr, "", null)
    val n = readln().toInt()
    println( arr.filter { it <= n }.size -1)
}
fun f(arr: TreeSet<Int>, s:String, d:Int?){
    if(s.length > 5)return
    if(s != "")arr.add(s.toInt())
    if(s == ""){
        for(i in 0..9){
            f(arr, i.toString(), d)
        }
    }
    else if(d == null){
        for(i in 0..10){
            f(arr, s, i - s.toInt())
        }
    }
    else{
        if(s.last().digitToInt() + d in 0..9)f(arr, s + (s.last().digitToInt() + d), d)
    }
}