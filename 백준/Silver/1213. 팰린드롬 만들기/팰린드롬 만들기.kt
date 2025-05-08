import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine()
    val arr = IntArray(26)
    input.forEach{
        arr[it.code - 'A'.code]++
    }
    val sb = StringBuilder()
    for(i in 0 until 26){
        while(arr[i]>=2){
            sb.append((i+'A'.code).toChar())
            arr[i]-=2
        }
    }
    if(arr.sum() >= 2){
        print("I'm Sorry Hansoo")
    }
    else if(arr.sum() == 1){

        print(sb.toString() + (arr.indexOf(1)+'A'.code).toChar() +sb.toString().reversed())
    }
    else{
        print(sb.toString() + sb.toString().reversed())
    }
}
