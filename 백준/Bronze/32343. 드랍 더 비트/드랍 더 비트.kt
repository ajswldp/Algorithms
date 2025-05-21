import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var s = "0".repeat(n).toCharArray()
    var k = readLine().split(" ").map ( String::toInt ).reduce { acc, i -> acc+i }
    for(i in 0 until n){
        if(k==0)break
        k--
        s[i] = '1'
    }
    for(i in n-1 downTo 0){
        if(k==0)break
        k--
        s[i] = '0'
    }
    print(s.joinToString("").toInt(2))
}