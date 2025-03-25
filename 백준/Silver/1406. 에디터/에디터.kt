import java.io.*
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val s = readLine()
    val n = readLine().toInt()
    val s1 = Stack<Char>()
    val s2 = Stack<Char>()
    for(c in s.toCharArray()){
        s1.push(c)
    }
    for(i in 0 until n){
        val input = readLine()
        when(input[0]){
            'P' -> s1.push(input[2])
            'B' -> if(s1.isNotEmpty()) s1.pop()
            'L' -> if(s1.isNotEmpty()) s2.push(s1.pop())
            'D' -> if(s2.isNotEmpty()) s1.push(s2.pop())
        }
    }
    while(s1.isNotEmpty()){
        s2.push(s1.pop())
    }
    val sb = StringBuilder()
    while(s2.isNotEmpty()){
        sb.append(s2.pop())
    }
    println(sb.toString())
}