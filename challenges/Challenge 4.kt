package challenges

/***
 * Challenge 4:
 *  Arrays and list have a reverse() method that reverse all the elements in-place, that is, within
 *  the original array or list. Write a function that does a similar thing, without using reverse(),
 *  and returns a new array with the elements of the original array in reverse order. This is the
 *  signature of the function:
 *
 *  fun reverse(array: Array<Int>): Array<Int>
 */

fun reverse(array: Array<Int>): Array<Int> {
    var newArray = arrayOf<Int>()
    var arraySize = array.size
    array.forEach {
        newArray += array[--arraySize]
    }
    return newArray
}

fun main() {
    println(reverse(arrayOf(1, 2, 3, 4, 5)).joinToString())
}