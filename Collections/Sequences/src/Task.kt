// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    val deliveredOrders = customer.orders.asSequence()
    return deliveredOrders.filter { it.isDelivered }
            .flatMap { it.products.asSequence() }
            .maxBy { it.price }
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    val listOfAllProducts = customers.asSequence()
    return listOfAllProducts
            .flatMap { it.getOrderedProducts() }.count { it == product }
}

fun Customer.getOrderedProducts(): Sequence<Product> =
        orders.flatMap { it.products }.asSequence()
