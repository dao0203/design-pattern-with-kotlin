package proxy

class PrinterProxy(
    private var name: String
): Printable{
    private var real: Printer? = null
    override fun setPrinterName(name: String) {
        if (real != null) {
            real!!.setPrinterName(name)
        }
        this.name = name
    }

    override fun getPrinterName(): String {
        return name
    }

    override fun print(string: String) {
        realize()
        real!!.print(string)
    }

    private fun realize() {
        if (real == null) {
            real = Printer(name)
        }
    }
}