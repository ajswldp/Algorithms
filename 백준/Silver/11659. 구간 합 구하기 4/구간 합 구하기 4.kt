import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val input = readLine().split(" ").map { it.toInt() }
    val tree = FenwickTree(input)
    for(i in 0 until m){
        val (a, b) = readLine().split(" ").map { it.toInt() }
        println(tree.sum(a, b))
    }
}
private class FenwickTree(){
    lateinit var arr: IntArray
    constructor(input: List<Int>) : this() {
        arr = IntArray(input.size+1)
        for(i in input.size downTo 1){
            var num = i
            while(num < input.size+1){
                arr[num] += input[i-1]
                num += num.and(-num)
            }
        }
    }
    fun sum(a:Int, b:Int):Int{
        var sum = 0
        if(a == 1){
            var idx = b
            while(idx!=0) {
                sum += arr[idx]
                idx -= idx.and(-idx)
            }
            return sum
        }
        return sum(1, b) - sum(1, a-1)
    }
}