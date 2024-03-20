package abstractfactory.factory

abstract class Page(
    protected val title: String,
    protected val author: String
) {
    protected val content = mutableListOf<Item>()
    fun add(item: Item) {
        content.add(item)
    }

    abstract fun makeHTML(): String
    fun output() {
        println(makeHTML())
    }
}
