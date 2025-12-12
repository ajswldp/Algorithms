import kotlin.math.max

fun main(){
    val n = readln().split(" ")[0].toInt()
    val board = Array(n){readln().split(" ").map{it.toInt()}.toIntArray()}
    var max = 0
    for(x in board.indices){
        for(y in board[x].indices){
            max = listOf(max, i(x, y, board), o(x, y, board), t(x, y, board), l(x, y, board), s(x, y, board)).max()
        }
    }
    println(max)
}
fun i(x:Int, y:Int, board: Array<IntArray>): Int{
    val list = mutableListOf<Int>()
    list.add(
        try {
            board[x][y] + board[x][y + 1] + board[x][y + 2] + board[x][y + 3]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x + 1][y] + board[x + 2][y] + board[x + 3][y]
        }
        catch (e: Exception){
            0
        }
    )
    return list.max()
}
fun o(x:Int, y:Int, board: Array<IntArray>): Int{
    return try{
        board[x][y] + board[x + 1][y + 1] + board[x][y + 1] + board[x + 1][y]
    }
    catch (e:Exception){
        0
    }
}
fun t(x:Int, y:Int, board: Array<IntArray>): Int{
    val list = mutableListOf<Int>()
    list.add(
        try {
            board[x][y] + board[x][y + 1] + board[x + 1][y + 1] + board[x][y + 2]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x + 1][y] + board[x + 1][y + 1] + board[x][y + 1] + board[x + 1][y + 2]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x + 1][y] + board[x + 1][y + 1] + board[x + 2][y]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y + 1] + board[x + 1][y + 1] + board[x + 1][y] + board[x + 2][y + 1]
        }
        catch (e: Exception){
            0
        }
    )
    return list.max()
}
fun l(x:Int, y:Int, board: Array<IntArray>): Int{
    val list = mutableListOf<Int>()
    list.add(
        try {
            board[x][y] + board[x + 1][y] + board[x + 2][y] + board[x][y - 1]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x + 1][y] + board[x + 2][y] + board[x][y + 1]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x + 1][y] + board[x + 2][y] + board[x + 2][y - 1]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x + 1][y] + board[x + 2][y] + board[x + 2][y + 1]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x][y + 1] + board[x][y + 2] + board[x + 1][y]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x][y + 1] + board[x][y + 2] + board[x - 1][y]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x][y + 1] + board[x][y + 2] + board[x + 1][y + 2]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x][y + 1] + board[x][y + 2] + board[x - 1][y + 2]
        }
        catch (e: Exception){
            0
        }
    )
    return list.max()
}
fun s(x:Int, y:Int, board: Array<IntArray>): Int{
    val list = mutableListOf<Int>()
    list.add(
        try {
            board[x][y] + board[x][y + 1] + board[x + 1][y + 1] + board[x + 1][y + 2]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x + 1][y] + board[x][y + 1] + board[x + 1][y + 1] + board[x][y + 2]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y] + board[x + 1][y] + board[x + 1][y + 1] + board[x + 2][y + 1]
        }
        catch (e: Exception){
            0
        }
    )
    list.add(
        try {
            board[x][y + 1] + board[x + 1][y] + board[x + 1][y + 1] + board[x + 2][y]
        }
        catch (e: Exception){
            0
        }
    )
    return list.max()
}