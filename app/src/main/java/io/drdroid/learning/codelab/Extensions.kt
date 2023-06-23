package io.drdroid.learning.codelab

fun main(){
    val animals = "carnivorous" to "lion"

    println("${animals.second} is a ${animals.first}")
    var (type, animal) = animals
    println(type)
    println(animal)
}