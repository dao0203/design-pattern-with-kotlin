package strategy

enum class Hand(
    private val handName: String,
    private val value: Int
){
    ROCK("グー", 0),
    SCISSORS("チョキ", 1),
    PAPER("パー", 2);

    fun isStrongerThan(hand: Hand): Boolean {
        return fight(hand) == 1
    }

    fun isWeakerThan(hand: Hand): Boolean {
        return fight(hand) == -1
    }

    private fun fight(hand: Hand): Int {
        return when {
            this == hand -> 0
            (this.value + 1) % 3 == hand.value -> 1
            else -> -1
        }
    }

    companion object {
        fun getHand(handValue: Int): Hand {
            return entries.find { it.value == handValue } ?: ROCK
        }
    }

    override fun toString(): String {
        return handName
    }
}
