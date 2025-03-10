import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val arr:CharArray = nextLine().toCharArray()
    val stack = Stack<Char>()
    var in_tag = false
    for(i in arr.indices){
        if(arr[i]=='>'||arr[i]=='<'){
            in_tag = !in_tag
            stackPrint(stack)
            print(arr[i])
        }
        else if(in_tag){
            print(arr[i])
        }
        else if(arr[i]==' '){
            stackPrint(stack)
            print(' ')
        }
        else{
            stack.push(arr[i])
        }
    }
    stackPrint(stack)
}
fun stackPrint(stack: Stack<Char>) {
    while (!stack.empty()) {
        print(stack.pop())
    }
}