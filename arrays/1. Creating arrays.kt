package arrays

fun main() {
    // Creating Arrays:
    val evenNumbers: Array<Int> = arrayOf(2, 4, 6, 8, 10)

    // It's also possible to create an array with all of its values set to a default value:
    val fourFives = Array(4) { 5 }
    fourFives.forEach { println(it) }

    // It's a good practice to always use val(constant) to declare arrays that's not going to change.
    val vowels = arrayOf("a", "e", "i", "o", "u")
}