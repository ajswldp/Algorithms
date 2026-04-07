fun main(){
    val n = readln().toInt()
    val board = readln().split(" ").map(String::toInt)
    val arr = IntArray(n)
    for(i in board.indices){
        var max = 0
        for(j in 0..<i){
            if(board[j] < board[i] && arr[j] > max)max = arr[j]
        }
        arr[i] = max + 1
    }
    println(arr.max())
}