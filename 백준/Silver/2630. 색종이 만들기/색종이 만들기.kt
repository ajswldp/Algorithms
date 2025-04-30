import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = Array(n) { IntArray(n) }
    for(i in 0 until n) {
        arr[i] = readLine().split(' ').map (String::toInt).toIntArray()
    }
    val (a, b) = f1(arr, 0, 0, n)
    println(a)
    println(b)
}
fun f1(arr: Array<IntArray>, x:Int, y:Int, k: Int):List<Int> {
    val output = f2(arr, x, y, k)
    if(output == -1){
        var a = 0
        var b = 0
        for(i in 0 until 4){
            val list = f1(arr, x + i%2*k/2, y + i/2*k/2, k/2)
            a += list[0]
            b += list[1]
        }
        return listOf(a, b)
    }
    else{
        if(output == 1){
            return listOf(0, 1)
        }
        else{
            return listOf(1, 0)
        }
    }
}
fun f2(arr: Array<IntArray>, x:Int, y:Int, k: Int):Int {
    for(i in x until x+k){
        for(j in y until y+k){
            if(arr[x][y] != arr[i][j])return -1
        }
    }
    return arr[x][y]
}