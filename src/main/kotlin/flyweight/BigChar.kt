package flyweight

import java.nio.file.Files
import java.nio.file.Path

class BigChar(charName: Char) {
    private val fontData: String

    init {
        val filename = "src/main/kotlin/flyweight/figures/big$charName.txt"
        val sb = StringBuilder()
        for (line in Files.readAllLines(Path.of(filename))) {
            sb.append(line)
            sb.append(System.lineSeparator())
        }
        this.fontData = sb.toString()
    }

    fun print() {
        println(fontData)
    }
}
