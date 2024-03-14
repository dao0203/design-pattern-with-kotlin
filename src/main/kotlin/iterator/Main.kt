package iterator

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bookShelf = BookShelf(4)
            bookShelf.appendBook(Book("Around the World in 80 Days"))
            bookShelf.appendBook(Book("Bible"))
            bookShelf.appendBook(Book("Cinderella"))
            bookShelf.appendBook(Book("Daddy-Long-Legs"))
            bookShelf.appendBook(Book("East of Eden"))

            val it = bookShelf.iterator()
            while (it.hasNext()) {
                val book = it.next()
                println(book?.name)
            }

        }
    }
}