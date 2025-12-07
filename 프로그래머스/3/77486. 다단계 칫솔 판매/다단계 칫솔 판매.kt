class Solution {
    fun solution(enroll: Array<String>, referral: Array<String>, seller: Array<String>, amount: IntArray): IntArray {
        val root = MyNode("root")
        val map = mutableMapOf<String, MyNode>()
        map["-"] = root
        for(i in enroll.indices){
            val parent = map[referral[i]]!!
            val child = MyNode(enroll[i], parent)
            parent.children.add(child)
            map[enroll[i]] = child
        }
        for(i in seller.indices){
            map[seller[i]]?.get(amount[i] * 100)
        }
        return enroll.map { map[it]?.count ?: 0 }.toIntArray()
    }
    class MyNode(val name: String, val parent: MyNode? = null){
        val children = mutableListOf<MyNode>()
        var count = 0
        fun get(num: Int){count += num
            if(parent != null) {
                count -= num / 10
                parent.get(num / 10)
            }
        }
    }
}