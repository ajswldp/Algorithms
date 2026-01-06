fun main() {
    var input = ""
    while (true) {
        input += " " + (readlnOrNull() ?: break)
    }
    input = input.replace("\n", " ")
    val result = input.replace("\\s+".toRegex(), " ").split(' ')
    var length = 0
    val output = StringBuilder()
    for(word in result) {
        when (word) {
            "<br>" -> {
                length = 0
                output.append('\n')
            }

            "<hr>" -> {
                if (length != 0) {
                    length = 0
                    output.append('\n')
                }
                output.append("--------------------------------------------------------------------------------\n")
            }

            else -> {
                if (length + word.length + 1 > 80) {
                    length = 0
                    output.append('\n')
                }
                else if(length != 0){
                    length++
                    output.append(' ')
                }
                length += word.length
                output.append(word)
            }
        }
    }
    println(output)
}