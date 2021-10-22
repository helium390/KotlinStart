fun main() {
    // FUNCTION BASICS
    fun printMyName() {
        println("My name is Dilshod.")
    }
    printMyName()

    // FUNCTION PARAMETERS
    fun printMultipleOfFive(value: Int) {
        println("$value * 5 = ${value * 5}")
    }
    printMultipleOfFive(10)

    fun printMultipleOf(multiplier: Int, andValue: Int) {
        println("$multiplier * $andValue = ${multiplier * andValue}")
    }
    printMultipleOf(4, 2)
    printMultipleOf(multiplier = 4, andValue = 2)

    fun printMultipleOfDefaultValue(multiplier: Int, value: Int = 1) {
        println("$multiplier * $value = ${multiplier * value}")
    }
    printMultipleOfDefaultValue(4 ,2)
    printMultipleOfDefaultValue(4)

    // RETURN VALUES
    fun multiply(number: Int, multiplier: Int): Int {
        return number * multiplier
    }

    fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
        return Pair(number * factor, number / factor)
    }
    val (product, quotient) = multiplyAndDivide(4, 2)

    fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier

    // Parameters as values
//    fun incrementAndPrint(value: Int) {
//        value += 1
//        println(value)
//    }
    fun incrementAndPrint(value: Int): Int {
        val newValue = value + 1
        println(newValue)
        return newValue
    }

    // OVERLOADING
    fun getValue(value: Int): Int {
        return value + 1
    }

    fun getValue(value: String): String {
        return "The value is $value"
    }

    // FUNCTIONS AS VARIABLES
}