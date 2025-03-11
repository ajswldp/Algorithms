import java.util.*
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val arr = IntArray(5)
    for(i in 0 until 5) {
        arr[i] = this.nextInt()
    }
    var num = 0
    var count = 0
    while(count<3){
        count = 0
        num++
        for(i in arr){
            if(num%i==0)count++
        }
    }
    print(num)
}