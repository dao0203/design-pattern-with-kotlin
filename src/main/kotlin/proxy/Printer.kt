package proxy

class Printer(
    private var name: String
): Printable {
    init {
        heavyJob()
    }
    override fun setPrinterName(name: String) {
        this.name = name
    }

    override fun getPrinterName(): String {
        return name
    }

    override fun print(string: String) {
        println("=== $name ===")
        println(string)
    }

    private fun heavyJob() {
        println("Printer is doing something...")
        for (i in 0 until 5) {
            Thread.sleep(1000)
            println(".")
        }
        println("Done.")
    }
}
