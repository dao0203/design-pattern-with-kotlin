package decorator

class StringDisplay(
    private val string: String
) : Display() {
    override fun getColumns(): Int {
        return string.length
    }

    override fun getRows(): Int {
        return 1
    }

    override fun getRowText(row: Int): String {
        return if (row == 0) {
            string
        } else {
            throw IndexOutOfBoundsException()
        }
    }
}
