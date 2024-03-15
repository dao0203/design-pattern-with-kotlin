package adapter.delegationpattern

import adapter.Banner

class PrintBanner(
    string: String
) : Print() {
    private val banner = Banner(string)
    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }

}