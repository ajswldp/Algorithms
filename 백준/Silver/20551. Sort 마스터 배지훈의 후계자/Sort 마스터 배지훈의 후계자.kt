fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(n){readln().toInt()}
    arr.sort()
    val map = mutableMapOf<Int, Int>()
    for(i in n-1 downTo 0){
        map[arr[i]] = i
    }
    val sb = StringBuilder()
    for(i in 1..m){
        sb.append("${map[readln().toInt()]?:-1}\n")
    }
    print(sb)
}