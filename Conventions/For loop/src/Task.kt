
class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate>{

            var currentValueData = start

            override fun next(): MyDate {
                if (!hasNext()) throw NoSuchElementException()
                val result = currentValueData
                currentValueData = currentValueData.followingDate()
                return result
            }
            // ретурним дату n, хоча в currentValueData дата уже на одиницю більша

            override fun hasNext(): Boolean {
                return currentValueData <= end
            }

        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}