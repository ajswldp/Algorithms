
class Solution {
    fun solution(n: Int, results: Array<IntArray>): Int {
        val nodes = Array(n+1){ Node(it + 1) }
        for( result in results ) {
            val (a, b) = result
            nodes[a].left.add(b)
            nodes[b].right.add(a)
        }
        fun dfs(num: Int, isLeft: Boolean, visited: BooleanArray = BooleanArray(n+1)):Int{
            visited[num] = true
            val list = if(isLeft) nodes[num].left else nodes[num].right
            if(list.isEmpty()) return 1
            return list.sumOf { if(!visited[it]) dfs(it, isLeft, visited) else 0 } + 1
        }
        var count = 0
        for( i in 1..n ){
            if(dfs(i, true) + dfs(i, false) == n+1) count++
        }
        return count
    }
    class Node(num: Int){
        val left = mutableListOf<Int>()
        val right = mutableListOf<Int>()
    }
}