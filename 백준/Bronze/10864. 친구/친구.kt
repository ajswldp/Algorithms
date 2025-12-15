fun main(){
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val arr = IntArray(n)
    for(i in 1..m){
        val (a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        arr[a]++
        arr[b]++
    }
    arr.forEach { println(it) }
}