package lists

val friends = mutableListOf("Michael", "Joshua", "Amos", "Kaycee")
fun main() {

    // Appending elements:
    friends.add("Emeka")
    // using the += operator to append:
    friends += "Ginika"
    println("Here is the list of all my friends: ${friends.joinToString()}")


    // Inserting elements:
    val successfullyAddedOnePlayer = players.add(4, "Uchenna")
    println(successfullyAddedOnePlayer)

    // Removing elements:
    val wasPlayerRemoved = players.remove("Gina")
    println("It is $wasPlayerRemoved that Gina was removed.")
    // The remove() doest two things: It removes the element and then returns a Boolean
    // indicating whether the removal was successful, so that you can make sure the cheater has been removed.

    // using removeAt(), which uses the exact index of the element to be removed.
    val removedPlayer = players.removeAt(1)
    println("$removedPlayer was removed.")
    // Unlike remove() which return the Boolean, removeAt() returns the element that was removed.
}