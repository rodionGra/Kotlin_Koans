// Build a map from the customer name to the customer
fun Shop.nameToCustomerMap(): Map<String, Customer> =
        this.customers.associate { it.name to it }

// Build a map from the customer to their city
fun Shop.customerToCityMap(): Map<Customer, City> =
        this.customers.associate { Pair(it, it.city) }

// Build a map from the customer name to their city
fun Shop.customerNameToCityMap(): Map<String, City> =
        this.customers.associate { Pair(it.name, it.city) }