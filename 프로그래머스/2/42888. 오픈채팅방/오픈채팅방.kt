class Solution {
    fun solution(record: Array<String>): Array<String> {
        val map = mutableMapOf<String, String>()
        val recordList = record.map { it.split(" ") }
        for(v in recordList){
            if(v.size == 3) map[v[1]] = v[2]
        }
        val list = mutableListOf<String>()
        for(v in recordList){
            if(v[0] == "Enter")list.add("${map[v[1]]}님이 들어왔습니다.")
            else if(v[0] == "Leave")list.add("${map[v[1]]}님이 나갔습니다.")
        }
        return list.toTypedArray()
    }
}