package arrays

fun main() {
    val oddNumbers = intArrayOf(1, 3, 5, 7, 9, 11)

    // To create an arrays of zeros:
    val zeros = DoubleArray(4) // 0.0, 0.0, 0.0, 0.0

    // You can convert between the boxed and primitive array using functions like toIntArray()
    val otherOddNumbers = arrayOf(1, 3, 5, 7, 9, 11).toIntArray()

}