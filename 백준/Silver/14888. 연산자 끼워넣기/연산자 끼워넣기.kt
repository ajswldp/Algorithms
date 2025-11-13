import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val opArr = readLine().split(" ").map { it.toInt() }.toIntArray()
    val opStack = Stack<Int>()
    var op = 0
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    while (true) {
        for(i in op until 4){
            if(opArr[op] != 0)break
            op++
        }
        if(op >= 4){
            if(opStack.isEmpty())break
            val popOp = opStack.pop()
            opArr[popOp]++
            op = popOp+1
        }
        else{
            opStack.push(op)
            opArr[op]--
            op = 0
            if(list.size-1 == opStack.size){
                var num = list[0]
                val opList2 = opStack.toList()
                for(i in 1 until list.size){
                    num = when(opList2[i-1]){
                        0 -> num + list[i]
                        1 -> num - list[i]
                        2 -> num * list[i]
                        else -> {
                            if(num < 0) -((-num)/list[i])
                            else num / list[i]
                        }
                    }
                }
                min = minOf(min,num)
                max = maxOf(max,num)
            }
        }
    }
    println("$max\n$min")
}