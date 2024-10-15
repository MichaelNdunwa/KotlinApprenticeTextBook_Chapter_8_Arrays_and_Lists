package lists

fun main() {
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    // Under the hood, the type used to store a List is an ArrayList.
    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")

    // Creating an empty List:
    val subscriber: List<String> = listOf()
    val count = listOf<Int>()

    // Mutable lists:
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val exoPlanets = mutableListOf<String>()

}