package strategy

class WinningStrategy: Strategy {

    private var won = false
    private var prevHand: Hand = Hand.ROCK
    override fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.entries.random()
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}
