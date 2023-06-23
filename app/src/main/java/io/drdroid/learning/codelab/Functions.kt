package io.drdroid.learning.codelab

fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    //filter element with more than 6 chars
    println(decorations.filter { it -> it.length > 6 })

    val lastStr = { list: List<String> ->
        list.last()
    }

    println(lastStr(decorations))
}