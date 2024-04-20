package interpreter

import java.nio.file.Files

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            try {
                for (text in Files.readAllLines(java.nio.file.Path.of("src/main/kotlin/interpreter/text/program.txt"))) {
                    println("text = \"$text\"")
                    val node = ProgramNode()
                    node.parse(Context(text))
                    println("node = $node")
                }
            } catch (e: ParseException) {
                e.printStackTrace()
            }
        }
    }
}