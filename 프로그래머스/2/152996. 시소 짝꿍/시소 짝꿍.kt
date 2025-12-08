import java.util.TreeMap

class Solution {
    fun solution(weights: IntArray): Long {
        var answer: Long = 0
        val treeMap = TreeMap<Int, Long>()
        for (weight in weights) treeMap[weight] = treeMap.getOrDefault(weight, 0) + 1
        treeMap.values.forEach { answer += it * (it - 1) / 2 }
        val arr = treeMap.keys.toIntArray()
        for(i in arr.indices){
            for(j in i+1 until arr.size){
                if(
                    arr[i] == arr[j] ||
                    arr[i] * 2 == arr[j] ||
                    arr[i] * 3 == arr[j] * 2 ||
                    arr[i] * 4 == arr[j] * 3
                ) answer+=treeMap[arr[i]]!! * treeMap[arr[j]]!!
                else if(arr[i] * 2 < arr[j]) break
            }
        }
        return answer
    }
}