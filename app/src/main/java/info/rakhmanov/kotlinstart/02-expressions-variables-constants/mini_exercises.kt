package info.rakhmanov.kotlinstart

fun main() {
    val myAge: Int = 31
    println("myAge: $myAge")

    var averageAge: Double = 31.0
    averageAge = (averageAge + 30) /2
    println("averageAge: $averageAge")

    val testNumber: Int = 18
    val evenOdd: Int = testNumber % 2
    println("evenOdd: $evenOdd")

    var answer: Int = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    println("answer: $answer")
}