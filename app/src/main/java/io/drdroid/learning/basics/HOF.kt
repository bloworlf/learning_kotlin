package io.drdroid.learning.basics

fun main() {
    val callFunction = { variable: Int ->
        println("some function $variable")
    }

    callFunction(2)

    val addLambda = { a: Int, b: Int ->
        println("something here")
        println("other thing there")
        a + b//returned value
    }

    println(addLambda)
    println(addLambda(3, 4))
}