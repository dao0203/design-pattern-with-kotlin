package abstractfactory

import abstractfactory.factory.Factory
import kotlin.system.exitProcess

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val factory1 = Factory.getFactory("abstractfactory.listfactory.ListFactory")
            val asahi = factory1.createLink("朝日新聞", "http://www.asahi.com/")
            val yomiuri = factory1.createLink("読売新聞", "http://www.yomiuri.co.jp/")
            val us_yahoo = factory1.createLink("Yahoo!", "http://www.yahoo.com/")

            val blogTray = factory1.createTray("ブログ")
            blogTray.add(asahi)
            blogTray.add(yomiuri)
            blogTray.add(us_yahoo)

            val page1 = factory1.createPage("LinkPage", "結城 浩")
            page1.add(blogTray)
            page1.output()
        }
    }
}
