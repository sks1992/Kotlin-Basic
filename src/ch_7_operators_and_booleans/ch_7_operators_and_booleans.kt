package ch_7_operators_and_booleans

//bite < bytes < short < int < long < float <double [according to size]

/*
*  = Assignment Operator
*  $ Reference  Operator
*  ${ } Reference Expression
*
* */

/*
*  Augmented Assignment
*
*   +=    =>
*   -=    =>
*   *=    =>
*   /+    =>
*   %+    =>
*
* */

//arithmetic operator
//
//fun main(){
//    //addition 5+7
//
//    val result =5+3
//    val result1 =5-3
//    val result2 =5*3
//    val result3 =5/3
//    val result4 =5%3
//    println(result)
//    println(result1)
//    println(result2)
//    println(result3)
//    println(result4)
//    println("HI " + "Sandeep" )
//
//    var num =6
//    num++
//    println(num)
//    num--
//    println(num)
//    println("${++num}")
//    println("${--num}")
//}

//fun main(){
//    var bike= 5
//    println(bike)
//    bike +=3
//    println(bike)
//    bike -= 1
//    println(bike)
//    bike *= 2
//    println(bike)
//    bike /= 2
//    println(bike)
//}

//fun main(){
//    println("Enter Your Amount :")
//    val yourAmount = readLine() ?:""
//    println("Your amount after multiply by 3 is ${yourAmount.toDouble()* 3}")
//}

/*
fun main() {
//    Read from the console the amount the user has in their bank account.
//
//The interest on that account is 5.5% per year.
//
//How much would that user have in 5 years?

    println("Please Enter Amount that you have in Bank Account: ")
    val amount = readLine() ?: ""
    val interestRate = 5.5
    val totalAmount =  amount.toDouble() + (((amount.toDouble() * interestRate) / 100) * 5)
    println("Total Amount after 5 Years : $totalAmount")
}*/

/*fun main(){
    //logic operator

    val isDay =true
    val isEvening =true
    //AND
    println(isDay && isEvening)
    //OR
    println(false || false)
    println(true || false)
    println(true || true)

    //NOT
    val night = !isDay
    println(night)
}*/

fun main() {
    //compression operator

    val a = 5
    val b = 2

    println("$a > $b return : ${a > b}")

    var ex1 = 5.374 * 95.847
    var ex2 = 3.237 * 15.3726
    println("$ex2 is less than $ex1 is ${ex2 < ex1}")

    //A farmer has 3 cows, of which only one produces milk
    //He has two children
    //He is trying to apply for funding. The requirements are
    //You must have no more than 5 animals
    //Animals must produce something that can be sold
    //Regardless of the other conditions, funding will be approved if the family has 3 or more members
    //Does the farmer receive the funding?

    var fCowTotal = 3
    var fCowProduceMilk = 1
    var fChildren = 2

    var canProvideFunding = ((5 >= fCowTotal) && (0 < fCowProduceMilk)) ||(fChildren +1 > 3)

    println("Farmer get funding :$canProvideFunding")


}