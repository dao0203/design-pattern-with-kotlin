package facade

import facade.pagamaker.PageMaker

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            PageMaker.makeWelcomePage("yuyudevelop0203@gmail.com", "welcome.html")
        }
    }
}
