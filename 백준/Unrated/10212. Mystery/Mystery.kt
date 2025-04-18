import java.io.*
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    print(if((2*Math.random()).toInt()==1)"Korea" else "Yonsei")
}