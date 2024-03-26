package facade.pagamaker

import java.io.FileWriter

object PageMaker {
    fun makeWelcomePage(mailaddr: String, filename: String) {
        val mailprop = Database.getProperties("maildata")
        val username = mailprop.getProperty(mailaddr)
        val writer = HtmlWriter(FileWriter(filename))
        writer.title("Welcome to $username's page!")
        writer.paragraph("Welcome to $username's web page!")
        writer.paragraph("Nice to meet you!")
        writer.mailto(mailaddr, username)
        writer.close()
        println("$filename is created for $mailaddr ($username)")
    }
}
