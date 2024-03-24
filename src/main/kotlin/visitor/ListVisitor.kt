package visitor

class ListVisitor : Visitor() {
    private var currentdir = ""

    override fun visit(file: File) {
        println("$currentdir/${file}")
    }

    override fun visit(directory: Directory) {
        println("$currentdir/${directory}")
        val savedir = currentdir
        currentdir = "$currentdir/${directory.name}"
        directory.iterator().forEach {
            it.accept(this)
        }
        currentdir = savedir
    }
}
