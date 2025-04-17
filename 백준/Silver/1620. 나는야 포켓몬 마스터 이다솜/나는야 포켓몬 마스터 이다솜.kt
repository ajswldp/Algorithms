import java.io.*
import java.util.HashMap

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val SBImap = HashMap<String, Int>()
    val IBSmap = HashMap<Int, String>()
    for(i in 1 ..n){
        val input = readLine()
        SBImap.put(input, i)
        IBSmap.put(i, input)
    }
    val sb = StringBuilder()
    for(i in 0 until m){
        val input = readLine()
        try {
            val n = input.toInt()
            sb.append(IBSmap.get(n))
        }catch(e:NumberFormatException){
            sb.append(SBImap.get(input))
        }
        sb.append("\n")
    }
    print(sb)
}