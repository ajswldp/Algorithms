fun main() {
    val s1 = readLine()!!
    val s2 = readLine()!!
    var count = 0
    var i = 0
    while(i < s2.length){
        var j = 1
        while(i+j<s2.length && s1.contains(s2.substring(i, i+j+1)))j++
        count++
        i+=j
    }
    println(count)
}