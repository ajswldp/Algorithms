import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (input1, input2) = readLine().split(" ")
    val arr = IntArray(100)
    for(i in 99 downTo 1) {
        if(input1.length >= 100-i) arr[i] += input1[input1.length-100+i].code - 48
        if(input2.length >= 100-i) arr[i] += input2[input2.length-100+i].code - 48
        if(arr[i]>=2){
            arr[i-1]++
            arr[i] -= 2
        }
    }
    var i = 0
    while(true){
        if(i>=99 || arr[++i] != 0) break
    }
    val sb = StringBuilder()
    while(i < 100){
        sb.append(arr[i++])
    }
    print(if(sb.isEmpty())0 else sb.toString())
}