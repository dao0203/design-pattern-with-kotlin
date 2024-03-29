package observer

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val generator = RandomNumberGenerator()
        val observer1 = DigitObserver()
        val observer2 = GraphObserver()
        generator.addObserver(observer1)
        generator.addObserver(observer2)
        generator.execute()
    }
}
