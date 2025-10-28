import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val map = HashMap<Int, Int>()
    readLine().split(' ').map { it.toInt() }.forEach {
        if(map.containsKey(it)) {
            map[it] = map[it]!! + 1
        }
        else{
            map[it] = 1
        }
    }
    val list = map.keys.sorted().toMutableList()
    var idx = 0
    while(idx < list.size) {
        if(idx + 1 < list.size && list[idx] + 1 == list[idx+1]){
            if(idx + 2 < list.size){
                f(map, list[idx])
                print("${list[idx+2]} ")
                map[list[idx+2]] = map[list[idx+2]]!! - 1
                if(map[list[idx+2]] == 0)list.removeAt(idx+2)
                idx++
                continue
            }
            else{
                f(map, list[idx+1])
                f(map, list[idx])
                break
            }
        }
        f(map, list[idx])
        idx++
    }
}
fun f(map: HashMap<Int, Int>, num:Int) {
    val n = map[num]!!
    for(i in 0 until n){
        print("$num ")
    }
}