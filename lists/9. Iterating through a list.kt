package lists

// Iterating through a list:
val countries = mutableListOf("Germany", "USA", "Mexico", "Canada", "Nigeria", "Ghana")
fun main() {
   countries.forEach { country ->
       println("The country is $country.")
   }

    println()
    countries.forEachIndexed { index, country ->
        println("${index + 1}. $country")
    }

    val productOfOneToSeven = productOfElements(listOf(1, 2, 3, 4, 5, 6, 7))
    println("The product of 1 to 7 is $productOfOneToSeven")
}

fun productOfElements(list: List<Int>): Int {
    var product = 1
    list.forEach { element ->
        product *= element
    }
    return product
}