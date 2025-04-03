import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt()
    var a = 0
    while(n>0){
        if((++a).toString().contains("666")){
            n--
        }
    }
    print(a)
}