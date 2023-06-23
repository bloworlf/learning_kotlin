package io.drdroid.learning.basics

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter a number : ")

    var input = reader.next()
    while (!input.matches(Regex("\\d+(.\\d+)?"))) {
        print("Only numbers are authorized : ")
        input = reader.next()
    }
//    var input : Int = reader.nextInt()
    println("You entered : $input")
}