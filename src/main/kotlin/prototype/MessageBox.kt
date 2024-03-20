package prototype

class MessageBox(
    private val decochar: Char
) : Product {
    override fun use(s: String) {
        val length = s.length
        repeat(length + 4) { print(decochar) }
        println()
        println("$decochar $s $decochar")
        repeat(length + 4) { print(decochar) }
        println()
    }

    override fun createCopy(): Product {
        return clone() as Product
    }
}
