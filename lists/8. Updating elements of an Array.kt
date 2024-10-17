package lists

// Note that while arrays are of fixed size and can otherwise not be changed, you can update the
// elements of an array using indexing syntax.

fun main() {
    val arrayOfInts = arrayOf(1, 2, 3)
    arrayOfInts[2] = -2
    println(arrayOfInts.joinToString())

    val arrayOfScienceSubjects = arrayOf("English", "Maths", "Physics", "Biology", "Chemistry")
    arrayOfScienceSubjects[1] = "Mathematics"
}