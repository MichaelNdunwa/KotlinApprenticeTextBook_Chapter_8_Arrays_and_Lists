package lists

fun main() {
    // 1. Using properties and methods.
    // 2. Using indexing.
    // 3. Using ranges to slice.


    // 1. Using properties and methods:
    val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
    // To check if a List is empty:
    println(players.isEmpty())
    if (players.size < 2) {
        println("We need at least two players!")
    } else {
        println("Let's start!")
    }

    // to access the first element in the list:
    var firstPlayer = players.first()
    println(firstPlayer)

    // printing the last player:
    println(firstPlayer.last())

    // will this throw an exception error:
    println(arrayOf(1, 1, 1, 1).min())

    val listOfNumbers = listOf(1, 2, 5, 6, 0)
    val nullableMin = listOfNumbers.minOrNull()
    val nonNullableMin = listOfNumbers.min()



    // 2. Using indexing:
    val secondPlayer = players[1]
    println("Second player is $secondPlayer")
    val thirdPlayer = players.get(2)
    println(thirdPlayer)


    // 3. Using ranges to slice:
    val upcomingPlayersSlice = players.slice(1..2)
    println(upcomingPlayersSlice.joinToString())
}