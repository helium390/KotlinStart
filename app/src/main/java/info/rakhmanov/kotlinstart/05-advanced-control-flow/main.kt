fun main() {
    // RANGES
    val closeRange = 0..5 // 0, 1, 2, 3, 4, 5

    val halfOpenRange = 0 until 5 // 0, 1, 2, 3, 4

    val decreasingRange = 5 downTo 0 // 5, 4, 3, 2, 1, 0

    // FOR LOOPS
    val count = 10
    var sum = 0
    for (i in 1..count) {
        sum += i
    }
    println(sum)

    // REPEAT LOOPS
    sum = 1
    var lastSum = 0
    repeat(10) {
        val temp = sum
        sum += lastSum
        lastSum = temp
    }
    println(lastSum)
}