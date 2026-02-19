import java.util.Locale.getDefault

fun main() {
    val n = readln().toInt()
    val map = BooleanArray(26) { true }
    for (i in 1..n) {
        val input = readln()
        val INPUT = input.uppercase(getDefault())
        val ARR = INPUT.split(" ")
        val arr = input.split(" ")
        var flag = false
        for (j in ARR.indices) {
            if (map[ARR[j][0].code - 'A'.code]) {
                map[ARR[j][0].code - 'A'.code] = false
                for (k in ARR.indices) {
                    if (j != k) print("${arr[k]} ")
                    else print("[${arr[j][0]}]${arr[j].substring(1)} ")
                }
                println()
                flag = true
                break
            }
        }
        if (flag) continue
        for (j in INPUT.indices) {
            if (!flag && (INPUT[j]!=' ' &&map[INPUT[j].code - 'A'.code])) {
                map[INPUT[j].code - 'A'.code] = false
                flag = true
                print("[${input[j]}]")
            } else print("${input[j]}")
        }
        println()
    }
}