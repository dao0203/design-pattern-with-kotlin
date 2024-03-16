package factorymethod

class IDCard(
    private val owner: String
) : Product() {

    init {
        println("$owner's card is created.")
    }

    override fun use() {
        println("$owner's card is used.")
    }

    override fun toString(): String {
        return "[IDCard: $owner]"
    }

    fun getOwner(): String {
        return owner
    }
}
