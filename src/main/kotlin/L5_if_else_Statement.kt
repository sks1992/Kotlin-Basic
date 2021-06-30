fun main() {
    var a = 10
    var b = 20

    if (a > b) {
        println("$a is grater than $b")
    } else if (a == b) {
        println("$a is equal to $b")
    } else {
        println("$a is less than $b")
    }

    val number = 20
    /*val result = if (number % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }*/
    val result = if (number % 2 == 0) "Even" else "Odd"
    println(result)
}