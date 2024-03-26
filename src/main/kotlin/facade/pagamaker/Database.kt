package facade.pagamaker

import java.io.FileReader
import java.util.*

object Database {
    fun getProperties(dbname: String): Properties {
        val filename = "src/main/kotlin/facade/$dbname.txt"
        val prop = Properties()
        prop.load(FileReader(filename))
        return prop
    }
}
