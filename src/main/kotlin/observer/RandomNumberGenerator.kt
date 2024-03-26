package observer

import kotlin.random.Random

class RandomNumberGenerator : NumberGenerator() {
    private var number: Int = 0
    override fun getNumber(): Int {
        return number
    }

    override fun execute() {
        for (i in 0 until 20) {
            number = Random.nextInt(50)
            notifyObservers()
        }
    }
}