package singleton

class Singleton {

    init {
        println("Create an instance.")
    }

    companion object {
        private val singleton = Singleton()
        @JvmStatic
        fun getInstance(): Singleton {
            println("Return the instance.")
            return singleton
        }
    }
}