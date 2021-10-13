package info.rakhmanov.kotlinstart

import kotlin.math.*


fun main() {
    // This is a comment. It is not executed.

    // This is also a comment.
    // Over multiple lines.

    /* This is also a comment. Over many..
    many...
    many lines. */

    /* This is a comment.
    /* And inside it is
    another comment. */
    Back to the first. */

    // PRINT
    println("Hello, Kotlin Apprentice reader!")

    // ARITHMETIC
    println(2 + 6)
    println(10 - 2)
    println(2 * 4)
    println(24 / 3)

    println(22 / 7)
    println(22.0 / 7.0)

    // Reminder
    println(28 % 10)
    println(28.0 % 10.0)

    println("%.0f".format(28.0 % 10.0))
    println("%.1f".format(28.0 % 10.0))
    println("%.2f".format(28.0 % 10.0))
    println("%.3f".format(28.0 % 10.0))

    // Shifting
    println(1 shl 3)
    println(32 shr 2)

    // Order
    println(350 / 5 + 2)
    println(350 / (5 + 2))

    // MATH FUNCTIONS
    println(sin(45 * PI / 180))
    println(cos(135 * PI / 180))
    println(sqrt(2.0))
    println(max(5, 10))
    println(min(-5, -10))
    println(max(sqrt(2.0), PI / 2))

    // VARIABLES & CONSTANTS
    val number: Int = 10
    //number = 0 /* Val cannot be reassigned */

    val pi: Double = 3.14159

    var variableNumber: Int = 42
    variableNumber = 0
    variableNumber = 1_000_000

    // ARITHMETIC WITH VARIABLES
    var counter: Int = 0
    counter += 1
    counter -= 1
    println(counter)

    counter = 10
    counter *= 3
    counter /= 2
    println(counter)
}