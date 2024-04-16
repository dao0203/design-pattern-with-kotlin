package state

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val frame = SafeFrame("State Sample")
            while (true) {
                for (hour in 0..23) {
                    frame.setClock(hour)
                    Thread.sleep(1000)
                }
            }
        }
    }
}
