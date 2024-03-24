package visitor

class Directory(
    override val name: String
) : Entry(), Iterable<Entry> {
    private val directory = mutableListOf<Entry>()

    override val size: Int
        get() = directory.sumOf { it.size }

    fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun iterator(): Iterator<Entry> {
        return directory.iterator()
    }

}
