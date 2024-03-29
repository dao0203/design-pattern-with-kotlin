package abstractfactory.factory

abstract class Link(
    caption: String,
    protected val url: String
) : Item(caption)
