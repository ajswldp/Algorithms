import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(' ').map{ it.toInt() }
    f(1, n, m, mutableListOf())
}
fun f(n: Int, max:Int, m: Int, mList: MutableList<Int>){
    if(m == 0){
        println(mList.joinToString(" "))
        return
    }
    for(i in n..max){
        val copyList = mList.toMutableList()
        copyList.add(i)
        f(i, max, m-1, copyList)
    }
}