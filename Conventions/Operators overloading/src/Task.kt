import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate {
    return this.addTimeIntervals(timeInterval, 1)
}

class Extra(val timeInterval: TimeInterval, val amount : Int)

operator fun TimeInterval.times(number: Int) =
        Extra(this, number)

operator fun MyDate.plus(timeIntervals: Extra) =
        addTimeIntervals(timeIntervals.timeInterval, timeIntervals.amount)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
