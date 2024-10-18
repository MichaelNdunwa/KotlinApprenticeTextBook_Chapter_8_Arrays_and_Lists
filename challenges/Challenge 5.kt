package challenges

/***
 * Challenge 5:
 *  The function below returns a random number between from(inclusive) and the to(exclusive):
 *
 *      import java.util.Random
 *      val random = Random()
 *      fun rand(from: Int, to: Int): Int {
 *          return random.nextInt(to - from) + from
 *       }
 *
 *   Use it to write a function that shuffles the elements of an array in random order. This is the
 *   signature of the function:
 *
 *      fun randomized(array: Array<Int>): Array<Int>
 */

import java.util.Random
val random = Random()
fun rand(from: Int, to: Int): Int {
    return random.nextInt(to - from) + from
}

fun randomized(array: Array<Int>): Array<Int> {
    var newArray = arrayOf<Int>()
//    array.forEach { newArray += array[rand(0, array.size)] } -> This guy here will repeat elements, which is not what I want.
    while (newArray.size < array.size) {
        val randomElement = rand(1, array.size + 1)
        if (randomElement !in newArray) newArray += randomElement
    }
    return newArray
}

fun main() {
    println(randomized(arrayOf(1, 2, 3, 4, 5)).joinToString())
}