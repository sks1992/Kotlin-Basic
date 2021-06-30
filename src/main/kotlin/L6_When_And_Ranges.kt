fun main() {
    val num = 5
    val result = num in 1..5 //1 2 3 4 5
    val result1 = num in 1 until 5 //1 2 3 4
    println(result)
    println(result1)

    when (val animals ="Dog") {
        "Horse" -> println("animals is Horse")
        "Dog" -> println("animals is Dog")
        else -> println("No animals")
    }

/* when as expression */
    val result2 = when(val age =50){
        in 1..25 -> "age between 1 to 25"
        in 26..50 ->"age between 26 to 50"
        else ->"no matching age"
    }
    println(result2)
}