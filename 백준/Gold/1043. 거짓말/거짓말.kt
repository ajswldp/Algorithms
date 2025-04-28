import java.io.*
import java.util.LinkedList
import java.util.Queue
import kotlin.math.sqrt

val map = HashMap<String, Int>()
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    var setList: MutableList<Set<Int>> = LinkedList<Set<Int>>()
    var nowSet = f(readLine())
    for(i in 0 until m){
        val set = f(readLine())
        if(set.intersect(nowSet).isEmpty()){
            setList.add(set)
        }
        else{
            nowSet = nowSet.union(set)
        }
    }
    var flag = true
    while(flag){
        flag = false
        setList = setList.filter {
            if(nowSet.intersect(it).isNotEmpty()){
                nowSet = nowSet.union(it)
                flag = true
                return@filter false
            }
            else return@filter true
        }.toMutableList()
    }
    print(setList.size)
}
fun f(s:String):Set<Int>{
    return s
        .substring(s.indexOf(' ')+1)
        .split(' ')
        .map{it.toInt()}
        .toSet()
}