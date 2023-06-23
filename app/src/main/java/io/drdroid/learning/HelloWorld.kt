package io.drdroid.learning

fun main(args: Array<String>) {
    println("Hello World")

    var language = "French"
    val score = 95

    var lang: String = language
    val sc: Int = score

    var time: Long = System.currentTimeMillis()
//    println("Starting at : $time")
    println(fibonacci(50))
//    time = System.currentTimeMillis()
    println("Ended in : ${(System.currentTimeMillis() - time) / 1000.0}s")
}

fun fibonacci(input: Int = 0): Long {
//    val result : Int = 0;

    if (input <= 1) {
        return input.toLong()
    }

    return fibonacci(input - 2) + fibonacci(input - 1)

//    return result
}