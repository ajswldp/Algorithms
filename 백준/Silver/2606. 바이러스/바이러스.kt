import java.io.*
var visited: BooleanArray = booleanArrayOf()
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()+1
    val m = readLine().toInt()
    val arr = Array(n){IntArray(n)}
    visited = BooleanArray(n)
    for(i in 0 until m){
        val input = readLine().split(" ").map{it.toInt()}
        arr[input[0]][input[1]] = 1
        arr[input[1]][input[0]] = 1
    }
    print(dfs(1, arr)-1)
}
fun dfs(n:Int, arr:Array<IntArray>): Int {
    var count = 1
    visited[n] = true
    arr[n].forEachIndexed { index, i -> if(i == 1&& !visited[index]) count+=dfs(index, arr) }
    return count
}