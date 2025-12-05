class Solution {
    fun solution(edges: Array<IntArray>, target: IntArray): IntArray {
        val map = mutableMapOf<Int, MyTreeNode>()
        for(edge in edges) {
            treeCrate(edge[0], edge[1], map)
        }
        val pointList = mutableListOf<Int>()
        val arr = IntArray(target.size)
        while(isOk(target, arr) == 0){
            val num = map[1]!!.get()
            pointList.add(num)
            arr[num-1]++
        }
        if(isOk(target, arr) == -1) return IntArray(1){-1}
        val answer = IntArray(pointList.size)
        for((i, t) in target.withIndex()){
            if(t == 0)continue
            val indexList = pointList
                .mapIndexed { index, v -> index * 1000 + v}
                .filter { it%1000 == i + 1 }
                .map { it/1000 }
                .sorted()
                .toMutableList()
            var num = t
            while(indexList.isNotEmpty()){
                if(num == indexList.size * 3){
                    answer[indexList.removeFirst()] = 3
                    num-=3
                }
                else if(num == indexList.size * 3 - 1){
                    answer[indexList.removeFirst()] = 2
                    num-=2
                }
                else{
                    answer[indexList.removeFirst()] = 1
                    num--
                }
            }
        }
        return answer
    }
    fun isOk(target: IntArray, arr: IntArray): Int {
        var flag = true
        for(i in target.indices) {
            if(arr[i] > target[i]) return -1
            if(arr[i] * 3 < target[i])flag = false
        }
        return if(flag) 1 else 0
    }
    fun treeCrate(num1: Int, num2: Int, map: MutableMap<Int, MyTreeNode>){
        var parent = map[num1]
        if(parent == null){
            parent = MyTreeNode(num1)
            map[num1] = parent
        }
        var child = map[num2]
        if(child == null){
            child = MyTreeNode(num2)
            map[num2] = child
        }
        parent.add(child)
    }
    class MyTreeNode(val number: Int) {
        private val nodes = mutableListOf<MyTreeNode>()
        private var idx = 0
        fun add(node: MyTreeNode){
            nodes.add(node)
            nodes.sortBy { it.number }
        }
        fun get(): Int{
            if(nodes.isEmpty())return number
            val num = nodes[idx].get()
            idx = (idx+1) % nodes.size
            return num
        }
    }
}