package io.drdroid.learning.basics

fun main() {
    /* Numbers */
    var byteVal: Byte = 101;
    var shortVal: Short = 32767
    var intVal: Int = 10
    var longVal: Long = 1448L
    var floatVal: Float = 172.04F
    var doubleVal: Double = 12.1

    /* Characters */
    val charVal: Char = 's'
    val boolVal: Boolean = true

    /* String */
    val stringVal: String = "This is a literal string"

    /* Arrays */
    var stringArray: Array<String> = arrayOf("lng", "lat")
    var intArray: Array<Int> = arrayOf(1, 2, 3, 4)

    println("$byteVal, $shortVal, $intVal, $longVal, $floatVal, $doubleVal, $charVal, $boolVal, $stringVal, ${stringArray.size}, ${intArray.size}")
}