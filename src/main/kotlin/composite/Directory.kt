package composite

class Directory(
    override val name: String
) : Entry() {
    private val directory = mutableListOf<Entry>()

    override val size: Int
        get() = directory.sumOf { it.size }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        directory.forEach { it.printList("$prefix/$name") }
    }
    fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }
}
