// Find all the different cities the customers are from
fun Shop.getCustomerCities(): Set<City>  = customers.map{ it.city }.toSet()
//The mapping transformation creates a collection
// from the results of a function on the elements of another collection.


// Find the customers living in a given city
fun Shop.getCustomersFrom(city: City): List<Customer> =
        customers.filter { it.city == city }
