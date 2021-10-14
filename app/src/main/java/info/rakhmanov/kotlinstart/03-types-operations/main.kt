fun main() {

    // CONVERTING TYPES
    var integer: Int = 100
    val decimal: Double = 12.5
    // integer = decimal // Type mismatch. Required: Int. Found: Double.
    integer = decimal.toInt()
    println(integer)

    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
    val totalCost: Double = hourlyRate * hoursWorked
    println(totalCost)


    // TYPE INFERENCE
    val typeInferredInt = 42 /* Type = Int    We can check in Intellij by pressing Control + Shift + P */
    val typeInferredDouble = 3.14159 /* Type = Double */

    val wantADouble = 3
    val actuallyDouble = 3.toDouble()
    //val actuallyDouble: Double = 3.0
    //val wantADouble = 3.0

    // CHARACTERS
    val characterA: Char = 'a'
    val stringDog: String = "Dog"  // val stringDog = "Dog"

    // STRING CONCATENATION
    var message = "Hello" + " my name is "
    val name = "Dilshod"
    message += name

    val exclamationMark: Char = '!'
    message += exclamationMark // Hello my name is Dilshod!

    // STRING TEMPLATES
    message = "Hello my name is $name!" // Hello my name is Dilshod!

    val oneThird = 1.0 / 3.0
//    val oneThirdLongString = "One third is $oneThird as a decimal."
    val oneThirdLongString = "One third is ${1.0 / 3.0} as a decimal."

    // LONG STRINGS
    val bigString = """
        |You can have a string
        |that contains multiple
        |lines
        |by
        |doing this
    """.trimIndent()
    println(bigString)

    // TUPLES
    val coordinates: Pair<Int, Int> = Pair(2, 3)
    val coordinatesInferred = Pair(2, 3)
    val coordinatesWithTo = 2 to 3

    val coordinatesDoubles = Pair(2.1, 3.5)
    val coordinatesMixed = Pair(2.1, 3)

    val x1 = coordinates.first
    val y1 = coordinates.second

    val (x, y) = coordinates
    // Here, you extract the values from coordinates and assign them to x and y

    val coordinates3D = Triple(2, 3, 1)
    val (x3, y3, z3) = coordinates3D
    //val x3 = coordinates3D.first
    //val y3 = coordinates3D.second
    //val z3 = coordinates3D.third

    val (x4, y4, _) = coordinates3D
    println(x4)
    println(y4)

    // AS (I don't know)
    val string = "Hello there"
    val charSequence = string as CharSequence
    println(charSequence)

    // NUMBER TYPES
    val a: Short = 12
    val b: Byte = 120
    val c: Int = -100000
    val answer = a + b + c // Answer will be an Int
    println(answer)

    // ANY, UNIT, AND NOTHING TYPES
    val anyNumber: Any = 42
    val anyString: Any = "42"

//    fun add() {
//        val result = 2 + 2
//        println(result)
//    }

    fun add(): Unit {
        val result = 2 + 2
        println(result)
    }

    fun doNothingForever(): Nothing {
        while (true) {

        }
    }
}