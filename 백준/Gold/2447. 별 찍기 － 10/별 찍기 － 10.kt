import java.util.*

fun main(args: Array<String>)  = with(Scanner(System.`in`)) {
    val n = nextInt()
    val arr = Array(n){CharArray(n)}
    f(0, n, 0, n, arr, false)
    println(arr.joinToString("\n") { it.joinToString("") })
}
fun f(l:Int, r:Int, u:Int, b:Int, arr: Array<CharArray>, flag:Boolean){
    if(flag){
        for(i in l until  r){
            for(j in u until  b){
                arr[i][j] = ' '
            }
        }
        return
    }
    if(l==r){
        arr[l][u] = '*'
        return
    }
    val length = (r - l)/3
    for(i in 1..3){
        for(j in 1 .. 3){
            f(l + length*(i-1), l + length*i, u + length*(j-1), u + length*j, arr, i==2&&j==2)
        }
    }
}