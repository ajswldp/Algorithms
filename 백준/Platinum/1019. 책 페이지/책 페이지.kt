import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = IntArray(10)
    var count = 1
    while(n>=count){
        val num = n/count
        if(num/10>0){
            arr[0] += (num/10-1)*count + if(num%10 > 0)count else if(num%10 == 0)n%count+1 else 0
        }
        for(i in 1..9){
            arr[i] += num/10*count + if(num%10 > i)count else if(num%10 == i)n%count+1 else 0
        }
        count*=10
    }
    print(arr.joinToString(" "))
}
