package ch_9_handling_exception

//fun main() {
//    //try catch finally
//    var test = readLine()
//    try {
//        println(test?.toInt())
//    } catch (e: Exception) {
//        e.printStackTrace()
//        println("An Exception has Occured : ${e.localizedMessage}")
//    }
//}

//
//fun main(){
//    //try catch finally
//    val txt = readLine()
//    try {
//        println(txt?.toInt())
//    }catch (e:Exception){
//        e.printStackTrace()
//        println("Some exception Occure: \n ${e.localizedMessage}")
//    }finally {
//        println("This block always run")
//    }
//}

//fun main(){
//    //throw
//    //A way to generate your own exception
//    //Can be used if you detect a state in your program that you can't be recovered from
//
//    var test = readLine()
//    throw  IllegalStateException("I don't like this input")
//
//}


fun main() {
    //A customer will tell the program what product they want to buy.
    //
    //Then, they will tell the program how many products they require.
    //
    //Assume the price of the product is 9.99
    //
    //What is the total?
    //
    //Handle any exceptions that might occur.


    try {
        println("What product you want to buy: ")
        var product = readLine()
        println("How many $product you required: ")
        var quantity = readLine()
        var noOfProduct = quantity?.toDouble()
        val productPrice = 9.99
        var total = noOfProduct?.times(productPrice)
        println("Total Price for $product is :$total")
    } catch (e: Exception) {
        e.printStackTrace()
        println("Some error occured: /n ${e.localizedMessage}")
    } finally {
        println("Shopping is complete")
    }
}