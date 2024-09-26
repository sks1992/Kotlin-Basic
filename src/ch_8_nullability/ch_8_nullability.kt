package ch_8_nullability
//
//fun main() {
//    var name: String = "sandeep"
//    // name = null   //we can not assign null value to this variable
//    //it gave error -> "Null can not be a value of a non-null type String"
//
//    var age: Int? = 10
//    age = null
//    //to make variable null  we need  ?
//
//    var cat: String? = "Tom"
//    // ? => nullable operator or Safe call Operator
//    println( cat?.length)
//    cat = null
//    println( cat?.length)
//}


//fun main(){
//    val num :Int? =10
//    println(num?.plus(10))
//    println(num?.minus(5))
//    println(num?.times(10))
//    println(num?.div(10))
//    println(num?.rem(10))
//}

//fun main(){
//    //Read a number from the console and convert it to Double.
//    //Multiply it by 7, and convert the result into a string.
//    //Print the length of that string to the console.
//
//    println("Please insert a number:")
//    val num = readLine()
//    val res = num?.toDouble()?.times(7)
//    println("Length Of Number $res is ${res.toString().length}")
//}

//fun main(){
//    // ?: elvis operator
//    val catName:String? = null
//    println(catName ?: "This cat no name")
//    println(catName ?: "This cat no name".length)
//}


//fun main(){
//    // !! non null assertion operation
//    val catName: String? = null
//    println(catName!!.length)
//}
//output
//Exception in thread "main" java.lang.NullPointerException
//	at ch_8_nullability.Ch_8_nullabilityKt.main(ch_8_nullability.kt:51)
//	at ch_8_nullability.Ch_8_nullabilityKt.main(ch_8_nullability.kt)


fun main(){
var productCost = 29.99
    println("How many item you want ?")
    val numberOfItems = readLine()
    val noOfItem = numberOfItems?.toInt() ?: 1
    println("Total price of item is ${productCost.times(noOfItem)}")
}