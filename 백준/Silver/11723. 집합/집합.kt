import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = BooleanArray(20)
    val sb = StringBuilder()
    for(i in 0 until n){
        val (com, num) = (readLine()+" 0").split(" ")
        when(com){
            "add"-> arr[num.toInt()-1] = true
            "remove"-> arr[num.toInt()-1] = false
            "check"-> sb.append(if(arr[num.toInt()-1]) "1\n" else "0\n")
            "toggle"-> arr[num.toInt()-1] = !arr[num.toInt()-1]
            "all"->{
                for(i in 0 until 20){
                    arr[i] = true
                }
            }
            "empty"->{
                for(i in 0 until 20){
                    arr[i] = false
                }
            }
        }
    }
    println(sb)
}