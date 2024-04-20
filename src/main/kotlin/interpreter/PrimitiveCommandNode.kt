package interpreter

/**
 *  <primitive command> ::= go | right | left
 */
class PrimitiveCommandNode: Node{
    private var name: String? = null

    @Throws(ParseException::class)
    override fun parse(context: Context) {
        name = context.currentToken()
        if (name == null) {
            throw ParseException("Missing command")
        } else if (name != "go" && name != "right" && name != "left") {
            throw ParseException("$name is undefined")
        } else {
            context.skipToken(name!!)
        }
    }

    override fun toString(): String {
        return name ?: ""
    }
}