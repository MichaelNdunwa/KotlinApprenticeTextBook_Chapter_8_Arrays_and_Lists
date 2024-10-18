package challenges

/***
 * Challenge 6:
 *  Write a function that calculates the minimum and maximum value in an array of integers.
 *  Calculate these values yourself; don't use the methods min and max. Return null if the given
 *  array is empty.
 *
 *  This is the signature of the function:
 *      fun minMax(numbers: Array<Int>): Pair<Int, Int>?
 *
 *   Hint: You can use the Int.MIN_VALUE and Int.MAX_VALUE constants within the function.
 */

fun minMax(numbers: Array<Int>): Pair<Int, Int>? {
    if (numbers.isEmpty()) return null

    var minNumber = numbers[0]
    var maxNumber = numbers[numbers.size - 1]
    for(number in numbers) {
        if (number < minNumber) {
            minNumber = number
        } else {
            maxNumber = number
        }
    }
    return Pair(minNumber, maxNumber)
}

fun main() {
    println(minMax(arrayOf(1, 2, 3, 4, 5)))
}