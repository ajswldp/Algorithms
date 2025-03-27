import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    for(i in 0 until n) {
        var num = i
        var sum = num
        while(num > 0){
            sum += num%10
            num /= 10
        }
        if(sum == n){
            print(i)
            return
        }
    }
    print(0)
}