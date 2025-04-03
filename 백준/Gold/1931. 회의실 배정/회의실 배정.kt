import java.io.*
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var time = 0
    var count = 0
    val list = ArrayList<IntArray>()
    for(i in 0 until n) {
        val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
        list.add(arr)
    }
    val sortedList = list.sortedBy{ it[0] }.sortedBy{ it[1] }
    for(arr in sortedList) {
        if(arr[0]>=time){
            count++
            time = arr[1]
        }
    }
    print(count)
}
