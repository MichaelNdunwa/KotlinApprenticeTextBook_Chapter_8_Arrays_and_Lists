package challenges

/***
 * Challenge 3:
 *  Write function that removes all occurrences of a given integer from a list of integers. This is
 *  the signature of the function.
 *
 *  fun remove(item: Int, list: List<Int>): List<Int>
 */

fun removeAllOccurrence(item: Int, list: List<Int>): List<Int> {
    return list.filter { it != item }
}

fun main() {
    println(removeAllOccurrence(2, listOf(1, 2, 3, 2, 4, 2, 5)))
}