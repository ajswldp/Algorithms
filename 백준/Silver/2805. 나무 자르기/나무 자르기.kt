import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k) = readLine().split(' ').map(String::toInt)
    val list = (readLine()+" 0").split(' ').map(String::toLong).sortedBy { -it }

    var sum = 0L
    var h = list[0]
    for(i in 1..n){
        if(h == list[i])continue
        val num = (h-list[i])*i
        if(sum + num < k){
            sum += num
            h = list[i]
        }
        else{
            print(h-(k-sum+i-1)/i)
            return
        }
    }
}