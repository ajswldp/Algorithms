fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val board = Array(m) { readln().split(" ").map { it.toInt()} }
    val arr = (0..n).toMutableList().toIntArray()
    for(line in board){
        var a = line[1]
        var b = line[2]
        while(a != arr[a]){
            var num = a
            for(i in 0..3) num = arr[num]
            arr[a] = arr[num]
            a = num
        }
        while(b != arr[b]){
            var num = b
            for(i in 0..3) num = arr[num]
            arr[b] = arr[num]
            b = num
        }
        if(line[0] == 0){
            if(a==b)continue
            arr[a] = b
        }
        else{
            println(if(a == b)"YES" else "NO")
        }
    }
}