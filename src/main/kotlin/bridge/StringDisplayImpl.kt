package bridge

class StringDisplayImpl(
    private val string: String
) : DisplayImpl() {

    private val width = string.toByteArray().size
    override fun rawOpen() {
        println()
    }

    override fun rawPrint() {
        println("|$string|")
    }

    override fun rawClose() {
        println()
    }
}
