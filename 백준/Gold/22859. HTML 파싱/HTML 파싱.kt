fun main() {
    val input = readln().split("title=\"")
    for(i in 1..<input.size) {
        val titleName = input[i].substring(0,input[i].indexOf('\"'))
        println("title : $titleName")
        val pTags = input[i]
            .substring(input[i].indexOf("<p>") + 3)
            .replace("</p>", "")
            .split("<p>")
            .map { it.replace("\\s+".toRegex(), " ").trim() }
        for(pTag in pTags) {
            var flag = true
            val sb = StringBuilder()
            pTag.forEach {
                when (it) {
                    '<' -> flag = false
                    '>' -> flag = true
                    else -> if(flag)sb.append(it)
                }
            }
            println(sb.replace("\\s+".toRegex(), " ").trim())
        }
    }
}