// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    //сет всіх продуктів, які замовляли
    val allProducts = customers.flatMap { it.getOrderedProducts() }.toSet()

    return customers.fold(allProducts) { orderedByAll, customer ->
        orderedByAll.intersect(customer.getOrderedProducts())
    }
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap { it.products }.toList()