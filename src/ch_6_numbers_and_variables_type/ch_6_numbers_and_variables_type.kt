package ch_6_numbers_and_variables_type

//fun main() {
//    val price = 34
//    val item = 3
//    val totalPrice = price * item
//    println(totalPrice)
//
//    val items = 5 //int
//    val noOfPeople = 7500000000 //long
//    val prices = 9.9 //Double
//    val floatNum = 2.99F  //Float
//
//    println(items::class.java)
//    println(noOfPeople::class.java)
//    println(prices::class.java)
//    println(floatNum::class.java)
//}

fun main(){
    println("Enter a Number: ")
    val num = readLine()?:""
    val dou = 3.5
    val res = num.toInt().times(dou)
    println(res)
    println(res::class.java)
}