import java.util.*
fun f1(sTop: Boolean, eTop: Boolean, s1: String, s2: String):Boolean {
    var top = 0
    var output = true
    var sTop2 = sTop
    for(i in s1.indices){
        if(s1[i] != s2[i]){
            output = output && f(sTop2, s1[i]=='I', s1.substring(top, i), s2.substring(top, i))
            sTop2 = s1[i]=='I'
            top = i+1
        }
    }
    return output&& f(sTop2, eTop, s1.substring(top), s2.substring(top))
}
fun f(sTop:Boolean, eTop:Boolean, s1:String, s2:String):Boolean {
    var isTop = sTop
    for(i in s1.indices){
        if(s1[i] == 'L')isTop = !isTop
    }
    return isTop == eTop
}
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    nextLine()
    val s1 = nextLine()
    val s2 = nextLine()
    var output = f1(true, false, s1.substring(1, s1.length-1), s2.substring(1, s2.length-1))
    if(s2[0] == 'L')output = output || f1(false, false, s1.substring(1, s1.length-1), s2.substring(1, s2.length-1))
    if(s1[s1.length-1] == 'L'){
        if(s2[0] == 'L')output = output || f1(false, true, s1.substring(1, s1.length-1), s2.substring(1, s2.length-1))
        output = output || f1(true, true, s1.substring(1, s1.length-1), s2.substring(1, s2.length-1))
    }
    if(output){
        println("YES")
    }
    else{
        println("NO")
    }
}