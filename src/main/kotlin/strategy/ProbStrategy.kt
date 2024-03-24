package strategy

class ProbStrategy : Strategy {
    private var prevHandValue = 0
    private var currentHandValue = 0
    private val history = Array(3) { IntArray(3) }
    override fun nextHand(): Hand {
        val bet = (0..getSum(currentHandValue)).random()
        val handValue = if (bet < history[currentHandValue][0]) {
            0
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            1
        } else {
            2
        }
        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.getHand(handValue)
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++
            history[prevHandValue][(currentHandValue + 2) % 3]++
        }

    }

    private fun getSum(hv: Int): Int {
        var sum = 0
        for (i in 0..2) {
            sum += history[hv][i]
        }
        return sum
    }
}
