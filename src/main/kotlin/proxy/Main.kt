package proxy

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p: Printable = PrinterProxy("Alice")
            println("Current name is ${p.getPrinterName()}.")
            p.setPrinterName("Bob")
            println("Current name is ${p.getPrinterName()}.")
            p.print("Hello, world.")
        }
    }
}