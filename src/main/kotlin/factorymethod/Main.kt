package factorymethod

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val factory: Factory = IDCardFactory()
            val card1: Product = factory.create("Alice")
            val card2: Product = factory.create("Bob")
            val card3: Product = factory.create("Charlie")
            card1.use()
            card2.use()
            card3.use()
        }
    }
}