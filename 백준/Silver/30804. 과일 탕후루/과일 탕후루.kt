import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
    var max = 2
    var count = 2
    var nodes = Pair(Node(0, 0, arr[0]), Node(-1, -1, -1))
    for(i in 1 until arr.size){
        if(arr[i] == nodes.first.num) nodes.first.maxIdx = i
        else if(arr[i] == nodes.second.num) nodes.second.maxIdx = i
        else{
            if(nodes.first.maxIdx > nodes.second.maxIdx){
                nodes.first.minIdx = nodes.second.maxIdx + 1
                nodes = Pair(nodes.first, Node(i, i, arr[i]))
            }
            else{
                nodes.second.minIdx = nodes.first.maxIdx + 1
                nodes = Pair(Node(i, i, arr[i]), nodes.second)
            }
        }
        count = max(nodes.first.maxIdx, nodes.second.maxIdx) - min(nodes.first.minIdx, nodes.second.minIdx) + 1
        max = max(max, count)
    }
    println(max - if(nodes.second.num == -1) 1 else 0)
}
class Node(
    var minIdx:Int,
    var maxIdx:Int,
    val num:Int
){}