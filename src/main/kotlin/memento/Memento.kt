package memento

class Memento(
    val money: Int,
) {
    private val fruits = mutableListOf<String>()
    fun addFruit(fruit: String) {
        fruits.add(fruit)
    }

    fun getFruits(): MutableList<String> {
        return fruits
    }
}
