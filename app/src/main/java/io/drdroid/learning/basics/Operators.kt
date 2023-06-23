package io.drdroid.learning.basics

fun main() {
    //addition|concatenation
    var num1: Int = 4
    var num2: Int = -7

    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)
    println("\t---")

    var num3 = 5.2
    var num4 = 3

    println(num3 + num4)
    println(num3 - num4)
    println(num3 * num4)
    println(num3 / num4)
    println(num3 % num4)
    println("\t---")

    val str1: String = "Something"
    val str2: String = "Happened"

    println(str1 + str2)

    val str3: String = "Nothing "
    val str4: String = "happened "
    val str5: String = "here."
    val str6 = str3 + str4 + str5

    println(str6)
    println("\t---")

    var a: Int = 2
    var b: Int = 3
    a += b
    println("a plus assign b -> $a")
    b -= a
    println("b minus assign a -> $b")
    a *= b
    println("a times assign b -> $a")
    b %= a
    println("b modulo assign a -> $b")
    a /= b
    println("a div assign b -> $a")
    a += b
    b += a
    println("$a")
    println("$b")
    println("\t---")

    var x: Int = 7
    var y: Int = -4
    var z: Boolean = false

    println("original x $x")
    println("unary plus x ${+x}")
    println("unary minus x ${-x}")
    println("pre increment x ${++x}")
    println("pre decrement x ${--x}")
    println("post increment x ${x++}")
    println("post decrement x ${x--}")
    println("original y $y")
    println("unary plus y ${+y}")
    println("unary minus y ${-y}")
    println("pre increment y ${++y}")
    println("pre decrement y ${--y}")
    println("post increment y ${y++}")
    println("post decrement y ${y--}")

    println("original z $z")
    println("not z ${!z}")

    println("\t---")

    var i1: Int = 12
    var i2: Int = 7
    var i3: Int = i1 * i2
    var i4: Double = i1 / (1.0 / i2)

    if (i3 > i4) {
        println("i3 is more than i4")
    } else if (i3 < i4) {
        println("i3 is less than i4")
    } else {
        println("i3 is equal to i4")
    }

    println("Biggest value between $i1 and $i2 is ${maxVal(i1, i2)}")

    if (i3 > i1 && i4 > i1) {
        println("Both $i3 and $i4 are greater than $i1 ")
    } else if (i3 > i1 || i4 > i1) {
        println("Either $i3 or $i4 are greater than $i1 ")
    } else {
        println("Neither $i3 nor $i4 are greater than $i1 ")
    }

    println(checkValueInList(arrayOf(i1, i2, i3, i4.toInt()), 5))
    println(checkValueInList(value = i2, list = arrayOf(1, 3, 5, 7, 9)))

    println(elementOfIntArray(arrayOf(2, 4, 6, 8, 0), 3))
    println(elementOfIntArray(arrayOf(2, 4, 6, 8, 0), 7))
    println(elementOfIntArray(arrayOf(2, 4, 6, 8, 0), -1))

    println(intArrayOf(1,2,3,4,5,6).slice(2..5))

    println(i1 and i2)
    println(i1 or i2)
    println(i1 xor i2)
    println(i1.inv())
}

fun maxVal(number1: Int, number2: Int): Int {
    var result: Int = if (number1 > number2) {
        number1
    } else {
        number2
    }

    return result
}

fun checkValueInList(list: Array<Int> = arrayOf(1, 2, 3, 4), value: Int = 2): String {
    return if (value in list) {
        "List contain $value"
    } else {
        "List doesn't contain $value"
    }
}

fun elementOfIntArray(array: Array<Int>, elementAt: Int): Int {
    if (elementAt < 0) {
        return array[0]
    }
    if (array.size < elementAt) {
        return array[array.size - 1]
    }

    return array[elementAt]
}