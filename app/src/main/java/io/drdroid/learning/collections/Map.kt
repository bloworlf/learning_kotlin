package io.drdroid.learning.collections

fun main() {
    val scores = mapOf("bob" to 10, "alice" to 9, "max" to 7, "adam" to 8, "adam" to 10)

    println(scores)
//    scores["max"] = 10
//    println(scores)

    println(scores.get("bob"))
    println(scores["alice"])

    val scores2 = mutableMapOf("bob" to 10, "alice" to 9, "max" to 7, "adam" to 8, "adam" to 10)
    println(scores2)
    scores2["max"] = 10
    println(scores2)
}