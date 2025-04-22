import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toLong()+1
    val sb = StringBuilder()
    val list = ArrayList<Long>()
    for (i in 1..Math.sqrt(n.toDouble()).toLong()) {
        if (n % i == 0L) {
            list.add(i)
            if(i!=1L&&i!=n/i) {
                list.add(n/i)
            }
        }
    }
    list.sorted().forEach {
        sb.append(it)
        sb.append(' ')
    }
    print(sb.toString())
}