package adapter

open class Banner(
    private val string: String
) {

    open fun showWithParen() {
        println("($string)")
    }

    open fun showWithAster() {
        println("*$string*")
    }
}
