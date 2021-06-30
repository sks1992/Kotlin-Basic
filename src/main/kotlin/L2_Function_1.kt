/* Function is a set of instruction to perform some tasks.
* Input -> Function -> Output*/

fun main() {
    println(functionName("sandeep Kumar"))
    println(functionName(a = "Mahesh Kumar"))
    val result = sum(10, 15)
    println(result)
    println(multi(5, 10))

    printMessage(3)
    printMessage()

}

/* Default argument Demo*/
fun printMessage(count: Int = 2) {
    for (i in 1..count)
        println("Hello $i")
}

fun functionName(a: String /* Input argument */): String/*Return type*/ {
    //code
    return a
}

fun multi(a: Int, b: Int): Int {
    return a * b
}

fun sum(a: Int, b: Int) = a + b