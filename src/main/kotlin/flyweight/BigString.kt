package flyweight

class BigString(string: String) {
    private val bigChars: List<BigChar>

    init {
        val factory = BigCharFactory
        bigChars = string.map { factory.getBigChar(it) }
    }

    fun print() {
        bigChars.forEach { it.print() }
    }
}