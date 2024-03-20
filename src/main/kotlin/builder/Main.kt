package builder

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val textBuilder = TextBuilder()
            val htmlBuilder = HTMLBuilder()
            val director = Director(textBuilder)
            val director2 = Director(htmlBuilder)
            director.construct()
            director2.construct()
            val result = textBuilder.getResult()
            val result2 = htmlBuilder.getHTMLResult()
            println(result)
            println(result2)
        }
    }
}