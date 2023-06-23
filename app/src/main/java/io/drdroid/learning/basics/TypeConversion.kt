package io.drdroid.learning.basics

fun main() {
    var int1: Int = 4
    var long1: Long = int1.toLong()

    println("$int1 to $long1")

    var double1: Double = 3.2
    var int2: Int = double1.toInt()
    println("$double1 to $int2")

    var int3 : Int = 7
    var double2 : Double = int3.toDouble()
    println("$int3 to $double2")

    var float1 : Float = 1.29F
    var long2 : Long = float1.toLong()
    println("$float1 to $long2")

    long1 = 184225256L
    var short1 : Short = long1.toInt().toShort()
    println("$long1 to $short1")

    double2 += 2.425
    var byte1 : Byte = double2.toInt().toByte()
    println("$double2 to $byte1")
}