package lists

/*** Mini-exercise:
 *      Write a for loop that prints the player's names and scores.
 *
 *      This is simple see what you'll do:
 *      Write a for loop that prints the Nigerian states and year of creations.
 */

/***
 * Abia State - 1991
 * Adamawa State - 1991
 * Akwa Ibom State - 1987
 * Anambra State - 1991
 * Bauchi State - 1976
 * Bayelsa State - 1996
 * Benue State - 1976
 * Borno State - 1976
 * Cross River State - 1976
 * Delta State - 1991
 * Ebonyi State - 1996
 * Edo State - 1991 (as Bendel State in 1976)
 * Ekiti State - 1996
 * Enugu State - 1991
 * Gombe State - 1996
 * Imo State - 1976
 * Jigawa State - 1991
 * Kaduna State - 1967
 * Kano State - 1967
 * Katsina State - 1987
 * Kebbi State - 1991
 * Kogi State - 1991
 * Kwara State - 1967
 * Lagos State - 1967
 * Nasarawa State - 1996
 * Niger State - 1976
 * Ogun State - 1976
 * Ondo State - 1976
 * Osun State - 1991
 * Oyo State - 1976
 * Plateau State - 1976
 * Rivers State - 1967
 * Sokoto State - 1976
 * Taraba State - 1991
 * Yobe State - 1991
 * Zamfara State - 1996
 */
fun main() {
    val statesInNigeria = listOf(
        "Abia State", "Adamawa State", "Akwa Ibom State", "Anambra State", "Bauchi State", "Bayelsa State",
        "Benue State", "Borno State", "Cross River State", "Delta State", "Ebonyi State", "Edo State",
        "Ekiti State", "Enugu State", "Gombe State", "Imo State", "Jigwa State", "Kaduna State", "Kano State",
        "Kastina State", "Kebbi State", "Kogi State", "Kwara State", "Lagos State", "Nasarawa State", "Niger State",
        "Ogun State", "Ondo State", "Osun State", "Oyo State", "Plateau State", "Rivers State",
        "Sokoto State", "Taraba State", "Yobe State", "Zamfara State"
    )

    val yearOfCreation = listOf(
        1991, 1991, 1987, 1991, 1976, 1996, 1976, 1976, 1976, 1991, 1996, 1991, 1996, 1991, 1996,
        1976, 1991, 1967, 1967, 1987, 1991, 1991, 1967, 1967, 1996, 1976, 1976, 1976, 1991, 1976,
        1976, 1967, 1976, 1991, 1991, 1996
    )

    statesInNigeria.forEachIndexed { index, state ->
        println("$state was created in ${yearOfCreation[index]}.")
    }
}