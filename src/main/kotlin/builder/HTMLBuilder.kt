package builder

class HTMLBuilder : Builder() {
    private val buffer = StringBuffer()
    override fun makeTitle(title: String) {
        buffer.append("<html><head><title>$title</title></head><body>\n")
        buffer.append("<h1>$title</h1>\n")
    }

    override fun makeString(str: String) {
        buffer.append("<p>$str</p>\n")
    }

    override fun makeItems(items: List<String>) {
        buffer.append("<ul>\n")
        for (item in items) {
            buffer.append("<li>$item</li>\n")
        }
        buffer.append("</ul>\n")
    }

    override fun close() {
        buffer.append("</body></html>\n")
    }

    fun getHTMLResult(): String {
        return buffer.toString()
    }
}
