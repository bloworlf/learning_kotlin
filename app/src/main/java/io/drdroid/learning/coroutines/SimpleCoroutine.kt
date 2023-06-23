package io.drdroid.learning.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Scanner
import java.util.concurrent.CountDownLatch

fun main(){
    var countdown = CountDownLatch(1)
    GlobalScope.launch {

        delay(1000L)
        println("Hello there")

        delay(500L)
        println("You")

        countdown.countDown()
    }

    countdown.await()
    println("End")
}