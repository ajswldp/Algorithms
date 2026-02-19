class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = IntArray(4)
        while(wallpaper[answer[0]].all { it=='.' })answer[0]++
        while(wallpaper.all { it[answer[1]]=='.' })answer[1]++
        answer[2] = wallpaper.size
        answer[3] = wallpaper[0].length
        while(wallpaper[answer[2]-1].all { it=='.' })answer[2]--
        while(wallpaper.all { it[answer[3]-1]=='.' })answer[3]--
        return answer
    }
}