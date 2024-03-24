package decorator

class SideBorder(
    private val borderChar: Char,
    display: Display
) : Border(display) {
    override fun getColumns(): Int {
        return 1 + display.getColumns() + 1
    }

    override fun getRows(): Int {
        return display.getRows()
    }

    override fun getRowText(row: Int): String {
        return "$borderChar${display.getRowText(row)}$borderChar"
    }
}
