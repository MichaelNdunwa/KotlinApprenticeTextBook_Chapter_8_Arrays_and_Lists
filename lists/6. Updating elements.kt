package lists

val fellas = mutableListOf("Michael", "Amos", "Onye Odinaka", "Joshua", "Kene")
fun main() {
    // Joshua has decided that we should call him Phantom X.
    fellas[3] = "Phantom X"
//    fellas.sort()
    println("Fellas: ${fellas.sorted().joinToString()}") // Ast MetaAI what's wrong with this code.
}