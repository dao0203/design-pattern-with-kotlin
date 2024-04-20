package interpreter

interface Node {
    @Throws(ParseException::class)
    fun parse(context: Context)
}
