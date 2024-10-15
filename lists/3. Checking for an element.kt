package lists

val players = mutableListOf("Michael", "Joshua", "Amos", "Kaycee")
fun isEliminated(player: String): Boolean {
   return player !in players
}

fun main() {
    println("Is Kene eliminated from the match? :${isEliminated("Kene")}")


    // The in operator corresponds to the contains() method.
    println(players.slice(1..3).contains("Kene"))
}