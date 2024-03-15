package adapter.delegationpattern

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p: Print = PrintBanner("Hello")
            p.printWeak()
            p.printStrong()
        }
    }
}