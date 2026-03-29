import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        val board = Array(n + 1) { BooleanArray(n + 1) { false } }
        for(wire in wires) {
            board[wire[0]][wire[1]] = true
            board[wire[1]][wire[0]] = true
        }
        fun dfs(node: Int, visited: BooleanArray = BooleanArray(n+1)): Int{
            visited[node] = true
            var sum = 1
            board[node].forEachIndexed { idx, bool -> if(bool && !visited[idx]) sum += dfs(idx, visited) }
            return sum
        }
        var min = n
        for(wire in wires) {
            board[wire[0]][wire[1]] = false
            board[wire[1]][wire[0]] = false
            min = min(min, abs(dfs(wire[0]) - dfs(wire[1])))
            board[wire[0]][wire[1]] = true
            board[wire[1]][wire[0]] = true
        }
        return min
    }
}