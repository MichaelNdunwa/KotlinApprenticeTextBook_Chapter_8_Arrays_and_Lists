package challenges

/***
 * Challenge 2:
 *      Write a function that removes the first occurrence of a given integer from a list of integers>
 *      This is the signature of the function.
 *
 *      fun removeOne(item: Int, list: List<Int>): List<Int>
 */

fun removeOne(item: Int, list: List<Int>): List<Int> {
    var list = list
    for (i in list) {
        list -= item
        break
    }
    return list
}

fun main() {
    println(removeOne(3, listOf(1, 2, 3, 3, 3, 4, 5)))
}