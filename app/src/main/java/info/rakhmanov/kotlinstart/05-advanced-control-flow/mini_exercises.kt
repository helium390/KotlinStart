import kotlin.math.sqrt

fun main() {
    val range = 1..10
    for (i in range) {
        println("$i ${i*i}")
    }

    for (i in range) {
        val squareRoot = sqrt(i.toDouble())
        println("$squareRoot")
    }

    var sum = 0
    for (row in 1 until 8 step 2) {
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println(sum)

    // WHEN EXPRESSIONS
    val myAge = 31

    when (myAge) {
        in 0..2 -> println("Infant")
        in 3..12 -> println("Child")
        in 13..19 -> println("Teenager")
        in 20..39 -> println("Adult")
        in 40..60 -> println("Middle aged")
        in 61..Int.MAX_VALUE -> println("Elderly")
        else -> println("Invalid age")
    }

    val (name, age) = Pair("Dilshod", 31)
    when (age) {
        in 0..2 -> println("$name is a infant")
        in 3..12 -> println("$name is a child")
        in 13..19 -> println("$name is a teenager")
        in 20..39 -> println("$name is an adult")
        in 40..60 -> println("$name is middle aged")
        in 61..Int.MAX_VALUE -> println("$name is elderly")
        else -> println("Invalid age")
    }
}