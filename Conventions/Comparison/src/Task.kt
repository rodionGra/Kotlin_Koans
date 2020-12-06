data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override operator fun compareTo(other : MyDate) : Int{
        return when {
            this.year > other.year -> 1
            this.year < other.year -> -1
            this.month > other.month -> 1
            this.month < other.month -> -1
            this.dayOfMonth > other.dayOfMonth -> 1
            this.dayOfMonth < other.dayOfMonth -> -1
            else -> 0
        }
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
