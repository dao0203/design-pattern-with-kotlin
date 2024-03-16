package factorymethod

class IDCardFactory : Factory() {
    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        println("Registering $product to the database.")
    }
}
