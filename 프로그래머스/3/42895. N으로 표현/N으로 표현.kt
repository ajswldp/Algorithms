class Solution {
    fun solution(N: Int, number: Int): Int {
        var max = N.toLong()
        val map = mutableMapOf<Long, Int>()
        var q = mutableListOf<Long>()
        for(i in 1..8){
            add(max, i, map, q)
            max *= 10
            max += N
        }
        for(i in 1..8){
            while(q.isNotEmpty()){
                val x = q.removeFirst()
                for(num in map.keys.toList()){
                    if(map[num]!! + map[x]!! <= 8 && num != 0L && x != 0L){
                        add(num + x, map[num]!! + map[x]!!, map, q)
                        add(num - x, map[num]!! + map[x]!!, map, q)
                        add(x - num, map[num]!! + map[x]!!, map, q)
                        add(num * x, map[num]!! + map[x]!!, map, q)
                        add(num / x, map[num]!! + map[x]!!, map, q)
                        add(x / num, map[num]!! + map[x]!!, map, q)
                    }
                }
            }
        }
        return map[number.toLong()] ?: -1
    }
    fun add(num1:Long, num2:Int, map: MutableMap<Long, Int>, q: MutableList<Long>){
        if((map[num1] ?: 10) <= num2)return
        map[num1] = num2
        q.add(num1)
    }
}