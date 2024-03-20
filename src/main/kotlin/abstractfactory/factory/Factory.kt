package abstractfactory.factory

abstract class Factory {
    companion object {
        fun getFactory(className: String): Factory {
            return try {
                Class.forName(className).getDeclaredConstructor().newInstance() as Factory
            } catch (e: ClassNotFoundException) {
                throw ClassNotFoundException("Class $className not found.")
            }
        }
    }

    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}
