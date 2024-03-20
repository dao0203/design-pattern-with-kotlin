package prototype

class UnderlinePen(
    private val ulchar: Char
) : Product {
    override fun use(s: String) {
        val length = s.length
        println("\"$s\"")
        print(" ")
        repeat(length) { print(ulchar) }
        println()
    }

    override fun createCopy(): Product {
        return clone() as Product
    }
}
