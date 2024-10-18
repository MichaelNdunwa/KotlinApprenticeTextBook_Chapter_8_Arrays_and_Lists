package challenges

/***
 * Challenge 1:
 *  Check out the following challenges to test your knowledge of Kotlin arrays and lists. As always,
 *  you can check out the solutions in the materials for this chapter.
 */

/// The commented lines of code are invalid.
fun main() {
    // 1. Which of the following 1-10 are valid statements?
    // val array1 = Array<Int>()
    // val array2 = arrayOf()
    val array3: Array<String> = arrayOf()

    // For the next three statements, array4 has been declared as:
    val array4 = arrayOf(1, 2, 3)
    println(array4[0])
    //println(array4[5])
    array4[0] = 4

    // For the final five statements, array5 has been declared as:
    val array5 = arrayOf(1, 2, 3)
    array5[0] = array5[1]
    //array5[0] = "Six"
//    array5 += 6
    // for item in array5 { println(item) }
}