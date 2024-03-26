package memento

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val gamer = Gamer(100)
        var memento = gamer.createMemento()
        for (i in 0 until 100) {
            println("==== $i")
            println("現状: $gamer")

            gamer.bet()

            println("所持金は${gamer.money}円になりました。")

            if (gamer.money > memento.money) {
                println("    (だいぶ増えたので、現在の状態を保存しておこう)")
                memento = gamer.createMemento()
            } else if (gamer.money < memento.money / 2) {
                println("    (だいぶ減ったので、以前の状態に復帰しよう)")
                gamer.restoreMemento(memento)
            }

            try {
//                Thread.sleep(1000)
            } catch (_: InterruptedException) {
            }
            println("")
        }
    }
}