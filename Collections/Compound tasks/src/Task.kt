// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    val deliveredOrders = customer.orders.filter { it.isDelivered }
    return deliveredOrders.flatMap { it.products }.maxBy { it.price }
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    val listOfAllProducts = customers.flatMap { it.getOrderedProducts()}
    return listOfAllProducts.count { it.name == product.name }
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap { it.products }.toList()
