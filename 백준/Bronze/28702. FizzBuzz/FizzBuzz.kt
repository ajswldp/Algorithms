import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    for(i in -3 ..-1){
        val input = readLine()
        if(input.toIntOrNull() != null){
            val n = input.toInt()-i
            if(n%3 == 0){
                print("Fizz")
            }
            if(n%5 == 0){
                print("Buzz")
            }
            if(n%5 != 0 && n%3 != 0){
                print(n)
            }
            return
        }
    }
}