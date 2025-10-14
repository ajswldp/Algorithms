import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val k = readLine().split(" ").map { it.toInt() }[1]
    val list = readLine().split(" ").map { it.toInt() }
    print(f(k, 0, 0, list) + if(k == 0) -1 else 0)
}
fun f(k:Int, idx: Int, sum:Int, list: List<Int>):Int{
    if(list.size == idx)
        return if(k==sum)1 else 0
    return f(k, idx+1, sum, list) + f(k, idx+1, sum + list[idx], list)
}