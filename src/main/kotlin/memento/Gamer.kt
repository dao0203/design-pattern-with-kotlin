package memento

class Gamer(
    var money: Int,
) {
    private var fruits = mutableListOf<String>()
    private val fruitsname = listOf("リンゴ", "ぶどう", "バナナ", "みかん")

    fun getFruit(): String {
        val prefix = if ((0..1).random() == 0) "おいしい" else ""
        return prefix + fruitsname[fruitsname.indices.random()]
    }

    fun bet() {
        val dice = (1..6).random()
        when (dice) {
            1 -> {
                money += 100
                println("所持金が増えました。")
            }

            2 -> {
                money /= 2
                println("所持金が半分になりました。")
            }

            6 -> {
                val f = getFruit()
                println("フルーツ($f)をもらいました。")
                fruits.add(f)
            }

            else -> {
                println("何も起こりませんでした。")
            }
        }
    }

    fun createMemento(): Memento {
        val m = Memento(money)
        fruits.forEach {
            if (it.startsWith("おいしい")) {
                m.addFruit(it)
            }
        }
        return m
    }

    fun restoreMemento(memento: Memento) {
        money = memento.money
        fruits = memento.getFruits().toMutableList()
    }

    override fun toString(): String {
        return "[money = $money, fruits = $fruits]"
    }
}