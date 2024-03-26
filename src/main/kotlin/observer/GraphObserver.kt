package observer

class GraphObserver : Observer {
    override fun update(generator: NumberGenerator) {
        print("GraphObserver: ")
        val count = generator.getNumber()
        for (i in 0 until count) {
            print("*")
        }
        println()
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}
