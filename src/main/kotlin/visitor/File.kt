package visitor

class File(
    override val name: String, override val size: Int
) : Entry() {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}
