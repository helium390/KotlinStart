fun main() {
    fun printFullName(firstName: String, lastName: String) {
        println("$firstName $lastName")
    }
    printFullName("Dilshod", "Rakhmanov")

    printFullName(firstName = "Dilshod", lastName = "Rakhmanov")

    fun calculateFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }
    val fullName = calculateFullName("Dilshod", "Rakhmanov")
    
    fun calculateFullNameWithLenght(firstName: String, lastName: String): Pair<String, Int> {
        var fullName = "$firstName $lastName"
        return Pair(fullName, fullName.length)
    }
    val fullNameLengs = calculateFullNameWithLenght("Dilshod", "Rakhmanov").second
    println(fullNameLengs)
}