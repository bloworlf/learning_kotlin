package io.drdroid.learning.collections

data class DataModel(
    val id: Int,
    val name:String,
    val role: String
)

fun main() {
    val numbers = listOf(1, 2, 3, 4) //read only

    println(numbers)

    val numbers2 = mutableListOf(1, 2, 3, 4)
    println(numbers2)
    numbers2.add(5)
    println(numbers2)

    val user1 = DataModel(1, "Juan", "admin")
    val user2 = DataModel(name = "Adam", role = "user", id = 2)
}