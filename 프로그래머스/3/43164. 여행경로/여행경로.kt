class Solution {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        val map = mutableMapOf<String, MutableList<String>>()
        for(ticket in tickets){
            val (from, to) = ticket
            map[from] = map.getOrDefault(from, mutableListOf())
            map[from]!!.add(to)
        }
        fun dfs(s: String, count: Int):String{
            if(count == tickets.size) return s
            val myTickets = map[s]
            if(myTickets == null || myTickets.isEmpty()) return ""
            myTickets.sort()
            var i = 0
            while(i < myTickets.size){
                val to = myTickets.removeAt(i)
                val an = dfs(to, count+1)
                if(an.isNotEmpty()) return "$s $an"
                myTickets.add(i++, to)
            }
            return ""
        }
        return dfs("ICN", 0).split(" ").toTypedArray()
    }
}