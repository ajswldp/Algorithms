import java.io.*
import java.math.BigInteger
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (k, n) = readLine().split(" ").map { it.toInt() }
    var num = BigInteger.ONE
    for(i in 1L..n){
         num = num.multiply(BigInteger.valueOf(k-i+1)).divide(BigInteger.valueOf(i))
    }
    print(num.mod(BigInteger.valueOf(10007L)))
}
