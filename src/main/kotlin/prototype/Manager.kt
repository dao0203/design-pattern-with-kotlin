package prototype

class Manager {
    private val showcase = HashMap<String, Product>()

    fun register(name: String, proto: Product) {
        showcase[name] = proto
    }

    fun create(protoname: String): Product {
        val p = showcase[protoname]
        return p?.createCopy() ?: throw IllegalArgumentException("No such product: $protoname")
    }
}
