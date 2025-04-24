import java.io.*
import java.lang.StringBuilder

val map = HashMap<String, Int>()
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val s1 = readLine()
    val s2 = readLine()
    val s3 = readLine()
    val n = readLine().toInt()
    f(n, 0, s1, "")
    f(n, 0, s2, "")
    f(n, 0, s3, "")
    val sb = StringBuilder()
    map.keys.sorted().forEach {
        if(map[it]!! > 1){
            sb.append(it)
            sb.append('\n')
        }
    }
    if(sb.isEmpty()){
        sb.append(-1)
    }
    println(sb.toString())
}
fun f(n:Int, idx: Int, input:String, s:String){
    if(n==0){
        map[s] = (map[s]?:0)+1
        return
    }
    if(idx >= input.length){
        return
    }
    else{
        f(n-1, idx+1, input, s+input[idx])
        f(n, idx+1, input, s)
    }
}