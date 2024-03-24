package decorator

class FullBorder(
    display: Display
): Border(display) {
    override fun getColumns(): Int {
        return 1 + display.getColumns() + 1
    }

    override fun getRows(): Int {
        return 1 + display.getRows() + 1
    }

    override fun getRowText(row: Int): String {
        return when (row) {
            0 -> "+${makeLine('-', display.getColumns())}+"
            display.getRows() + 1 -> "+${makeLine('-', display.getColumns())}+"
            else -> "|${display.getRowText(row - 1)}|"
        }
    }

    private fun makeLine(ch: Char, count: Int): String {
        return ch.toString().repeat(count)
    }
}
