package lists

fun main() {
    var nullableList: List<Int>? = listOf(1, 2, 3, 4, 5) // The list itself is nullable not the individual elements.
    var listOfNullables: List<Int?> = listOf(1, 2, 3, 4, 5) // Here the individual element are nullable.
    var nullableListOfNullables: List<Int?>? = listOf(1, 2, 3, 4, 5, null) // Both the list and its elements are nullable.


}