package interpreter

class Context(
    private val text: String
) {
    private val tokenizer = text.split(" ")
    private var index = 0
    private var currentToken: String? = null

    init {
        nextToken()
    }


    fun currentToken(): String? {
        return currentToken
    }

    fun nextToken(): String? {
        currentToken = if (index < tokenizer.size) {
            tokenizer[index++]
        } else {
            null
        }
        return currentToken
    }

    @Throws(ParseException::class)
    fun skipToken(token: String) {
        if (token != currentToken) {
            throw ParseException("Warning: $token is expected, but $currentToken is found.")
        }
        nextToken()
    }

    fun currentNumber(): Int {
        return currentToken?.toInt() ?: throw ParseException("Warning: Number is expected, but $currentToken is found.")
    }
}