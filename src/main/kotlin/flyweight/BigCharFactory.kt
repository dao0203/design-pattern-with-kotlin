package flyweight

object BigCharFactory {
    private val pool = HashMap<String, BigChar>()

    fun getBigChar(charName: Char): BigChar = synchronized(pool) {
        var bc = pool[charName.toString()]
        if (bc == null) {
            bc = BigChar(charName)
            pool[charName.toString()] = bc
        }
        return bc
    }
}