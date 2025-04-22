import java.io.*
import java.util.TreeSet

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val input = readLine().split(" ").map { it.toInt() }
    val set = TreeSet(input)
    val map = HashMap<Int, Int>()
    set.forEachIndexed { index, i -> map.put(i, index) }
    val sb = StringBuilder()
    input.forEach{
        sb.append(map[it])
        sb.append(' ')
    }
    print(sb.toString())
}