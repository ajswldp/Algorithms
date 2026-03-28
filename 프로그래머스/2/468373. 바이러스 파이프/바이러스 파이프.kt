import java.util.LinkedList

class Solution {
    val list = mutableListOf<IntArray>()
    fun solution(n: Int, infection: Int, edges: Array<IntArray>, k: Int): Int {           makeArr(0, IntArray(k))
        val board = Array(n) { IntArray(n) }
        var max = 0
        for (arr in list) {
            val visited = BooleanArray(n + 1)
            visited[infection] = true
            val edgesQueue = edges.toCollection(LinkedList<IntArray>())
            val b = IntArray(0)
            edgesQueue.add(b)
            for(num in arr) {
                while(edgesQueue[0].isNotEmpty()){
                    val edge = edgesQueue.removeFirst()
                    if((visited[edge[0]] || visited[edge[1]]) && edge[2] == num){
                        visited[edge[0]] = true
                        visited[edge[1]] = true
                        edgesQueue.removeIf { it.size == 0 }
                        edgesQueue.add(b)
                    }
                    else{
                        edgesQueue.add(edge)
                    }
                }
                edgesQueue.removeFirst()
                edgesQueue.add(b)
            }
            max = maxOf(max, visited.count{it})
        }
        return max
    }
    fun makeArr(count: Int, arr:IntArray){
        if(count == arr.size){
            list.add(arr.copyOf())
            return
        }
        for(i in 1..3){
            if(count == 0 || arr[count-1] != i){
                arr[count] = i
                makeArr(count + 1, arr)
                arr[count] = 0
            }
        }
    }
}