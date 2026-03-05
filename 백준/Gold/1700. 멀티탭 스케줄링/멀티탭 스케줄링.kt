fun main(){
    val n = readln().split(" ")[0].toInt()
    val arr = readln().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    var count = 0
    for(i in arr.indices){
        if(list.size < n){
            if(!list.contains(arr[i])) list.add(arr[i])
            continue
        }
        if(!list.contains(arr[i])){
            val d = list.map {
                for(j in i+1 until arr.size){
                    if(it == arr[j])
                        return@map j
                }
                return@map arr.size
            }
            list.remove(list[d.indexOf(d.max())])
            count++
            list.add(arr[i])
        }
    }
    println(count)
}