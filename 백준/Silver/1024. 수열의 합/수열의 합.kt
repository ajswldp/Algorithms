import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    for(i in k..k+200){
        if(i%2 == 1 && n/i-i/2 < 0 || i%2==0 && (n*2/i+1)-i<0 || i > 100){
            println(-1)
            return
        }
        if(i%2 == 1 && n%i == 0){
            for(j in n/i-i/2 .. n/i+i/2){
                print("$j ")
            }
            return
        }
        else if(i%2 == 0 && n % (i/2) == 0 && n / (i/2)%2 == 1){
            for(j in (n*2/i/2-i/2+1)..n*2/i/2+i/2){
                print("$j ")
            }
            return
        }
    }
}
