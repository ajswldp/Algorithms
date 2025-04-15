import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = Array(40){IntArray(40)}
    val (a, b, c) = readLine().split(" ").map{it.toInt()}
    for(i in 0 until a+c){
        for(j in 0 ..i){
            if(j == 0) arr[i][j] = 1
            else arr[i][j] = arr[i-1][j-1] + arr[i-1][j]
        }
    }
    var sum = 0
    for(i in 0 until c){
        for(j in 0 ..i){
            sum += arr[i+a-1][j+b-1]
        }
    }
    print(sum)
}
