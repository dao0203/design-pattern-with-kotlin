package flyweight

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bs = BigString("1212123")
            bs.print()
        }
    }
}