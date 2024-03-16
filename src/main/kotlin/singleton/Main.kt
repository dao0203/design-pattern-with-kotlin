package singleton

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Start.")
            val obj1 = Singleton.getInstance()
            val obj2 = Singleton.getInstance()
            if (obj1 == obj2) {
                println("obj1 and obj2 are the same instance.")
            } else {
                println("obj1 and obj2 are different instances.")
            }
            println("End.")
        }
    }
}