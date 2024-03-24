package bridge

open class Display(private val impl: DisplayImpl) {

    open fun open() {
        impl.rawOpen()
    }

    open fun print() {
        impl.rawPrint()
    }

    open fun close() {
        impl.rawClose()
    }

    fun display() {
        open()
        print()
        close()
    }
}
