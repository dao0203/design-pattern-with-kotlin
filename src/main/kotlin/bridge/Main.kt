package bridge

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val d1 = Display(StringDisplayImpl("Hello, Japan."))
            val d2 = CountDisplay(StringDisplayImpl("Hello, World."))
            val d3 = CountDisplay(StringDisplayImpl("Hello, Universe."))
            d1.display()
            d2.display()
            d3.display()
            d3.multiDisplay(5)
        }
    }
}