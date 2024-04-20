package interpreter

/**
 *  <program> ::= program <command list>
 */
class ProgramNode : Node {
    private val commandListNode: Node = CommandListNode()

    @Throws(ParseException::class)
    override fun parse(context: Context) {
        context.skipToken("program")
        commandListNode.parse(context)
    }

    override fun toString(): String {
        return "[program $commandListNode]"
    }
}
