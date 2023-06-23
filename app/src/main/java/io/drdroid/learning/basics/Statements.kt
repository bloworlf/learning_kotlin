package io.drdroid.learning.basics

fun main() {
    println(dayOfWeek(4))

    println(leapYear(2020))
}

fun dayOfWeek(day: Int): String {
    return when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Not a known day"
    }
}

fun leapYear(year: Int): String {
    var result = if (year % 4 == 0) {
        "$year is a leap year"
    } else {
        "$year is not a leap year"
    }

    return result
}