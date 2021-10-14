import kotlin.math.PI

fun main() {

    // Challenge 1 - Create a constant called coordinates and assign a pair containing two and three to it.
    val coordinates = Pair(2, 3)

    // Challenge 2 - Extract the values 2 and 3 from coordinates into two variables called row and column.
    val (row, column) = coordinates

    // Challenge 3 - Which of the following are valid statements?
//    val character: Character = "Dog"
    val character: Char = 'd'
    val string: String = "Dog"
//    val string: String = 'd'

    // Challenge 4 - Is this valid code?
    val date = Triple(15, 8, 2015)
//    val day = date.First // INVALID
    val day = date.first

    // Challenge 5 - What is wrong with the following code?
//    val name = "Joe" // val is immutable
//    name += " Howard"
    var name = "Joe" // val is immutable
    name += " Howard"

    // Challenge 6 - What is the type of the constant named value?
    val triple = Triple(100, 1.5, 10)
    val value = triple.second // Double - Ctrl+Shift+P

    // Challenge 7 - What is the value of the constant named month?
    val newDate = Triple(15, 8, 2015)
    val month = newDate.second // Int

    // Challenge 8 - What is the value of the constant named summary?
    val number = 10
    val multiplier = 5
    val summary = "$number multiplied by $multiplier equals ${number * multiplier}" // String
    println(summary)

    // Challenge 9 - What is the sum of a and b, minus c? What is its type?
    val a = 4
    val b: Short = 100
    val c: Byte = 12
    val sum = (a + b) - c // Int
    println(sum)

    // Challenge 10 - What is the numeric difference between kotlin.math.PI and kotlin.math.PI.toFloat()?
    println(PI - PI.toFloat())
}