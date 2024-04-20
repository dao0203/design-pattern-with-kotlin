package interpreter

/**
 *  <command> ::= <repeat command> | <primitive command>
 */
class CommandNode : Node {

    private lateinit var node: Node

    @Throws(ParseException::class)
    override fun parse(context: Context) {
        if (context.currentToken() != "repeat") {
            node = PrimitiveCommandNode()
            node.parse(context)
        } else {
            node = RepeatCommandNode()
            node.parse(context)
        }
    }

    override fun toString(): String {
        return node.toString()
    }
}
