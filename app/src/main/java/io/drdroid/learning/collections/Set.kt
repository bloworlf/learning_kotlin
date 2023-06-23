package io.drdroid.learning.collections

fun main() {
    val values = listOf(1,2,2,3,2,4,2,6,23,3,4,56,3,35,6,3,67,7,8,32,52,5,663,3,6,3,6,3,5,34,32,67,7,36,47,48,8,47,48,43,63)
    val valueSet = values.toSet()

    println(values)
    println(values.size)
    println(valueSet)
    println(valueSet.size)
}