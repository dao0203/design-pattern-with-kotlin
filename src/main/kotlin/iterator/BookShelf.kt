package iterator

class BookShelf(
    maxSize: Int = 0
) : Iterable<Book?> {

    private var books: ArrayList<Book?> = ArrayList(maxSize)
    private var last = 0


    fun getBookAt(index: Int): Book? {
        return books[index]
    }

    fun appendBook(book: Book) {
        books.add(last, book)
        last++
    }

    fun getLength(): Int {
        return books.size
    }

    override fun iterator(): Iterator<Book?> {
        return BookShelfIterator(this)
    }

}