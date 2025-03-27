import java.io.*
import java.util.Stack

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    while(true) {
        val input = readLine()
        if(input == ".") break
        val s = input.replace(Regex("[^\\[\\]{}()]+"), "")
        val stack = Stack<Char>()
        for(c in s) {
            if(stack.isEmpty() || stack.peek().code != c.code - (if(stack.peek().code>50) 2 else 1)) {
                stack.push(c)
            }
            else{
                stack.pop()
            }
        }
        println(if(stack.isEmpty()) "yes" else "no")
    }
}