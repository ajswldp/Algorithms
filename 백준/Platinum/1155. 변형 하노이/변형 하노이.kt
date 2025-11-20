import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.Stack
import kotlin.collections.isNotEmpty

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = readLine().split(" ").map { Pair(it[0].code-65, it[1].code-65) }
    if(n < 7){
        println(f(n, arr))
        return
    }
    val v3 = f(3, arr)
    val v4 = f(4, arr)
    val v5 = f(5, arr)
    val a = (v5-v4) / (v4-v3)
    val b = v4 - v3 * a
    if(f(6, arr) != v5*a+b) IOException("씨발")
    var num = v5.toLong()
    repeat(n-5){
        num = num*a+b
    }
    println(num)
}
fun f(n: Int, arr: List<Pair<Int, Int>>):Int{
    val board = Array(3) { Stack<Int>() }
    for (i in n downTo 1) {
        board[0].push(i)
    }
    var count = 0
    var p = -1
    while(board[0].isNotEmpty() || (board[1].isNotEmpty() && board[2].isNotEmpty())) {
        for(i in 0..5){
            val (a, b) = arr[i]
            if(board[a].isEmpty() || p == a)continue
            if(board[b].isNotEmpty() && board[b].peek() <= board[a].peek()) continue
            board[b].push(board[a].pop())
            p = b
            count++
            break
        }
    }
    return count
}