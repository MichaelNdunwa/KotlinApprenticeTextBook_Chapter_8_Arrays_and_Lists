package lists

val friends = mutableListOf("Michael", "Joshua", "Amos", "Kaycee")
fun main() {

    // Appending elements:
    friends.add("Emeka")
    // using the += operator to append:
    friends += "Ginika"
    println("Here is the list of all my friends: ${friends.joinToString()}")


    // Inserting elements:
}