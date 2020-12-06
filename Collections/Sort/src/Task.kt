// Return a list of customers, sorted in the descending by number of orders they have made
fun Shop.getCustomersSortedByOrders(): List<Customer> =
        customers.sortedByDescending { it.orders.size }
        //sortDescending() is applied to an ArrayList of elements
// like integers or strings, but sortedByDescending() is
// applied to an ArrayList of elements that have properties that we wish to sort-by.