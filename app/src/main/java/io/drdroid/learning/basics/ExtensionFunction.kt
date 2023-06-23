package io.drdroid.learning.basics

class Circle(val radius: Double) {
    fun area(): Double {
        return Math.PI * radius * radius
    }
}

//use the class and create function
//without modifying the class
fun Circle.perimeter(): Double {
    return 2 * Math.PI * radius
}

fun main() {
    val circle: Circle = Circle(5.5)
    println(circle.area())

    println(circle.perimeter())
}