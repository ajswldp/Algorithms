import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val arr = readLine().split(' ').map(String::toInt).sortedBy { -it }
    var sum = 0
    var num = 0
    arr.forEach {
        num += sum*it
        sum += it
    }
    print(num)
}