package ch_5_user_input

import java.util.Calendar

//fun main() {
//    //user input we use readLine()
//    println("Please enter your name :")
//    val name = readlnOrNull()
//    println("Your Name is : $name")
//    println("Please Enter Your Age: ")
//    val age = readLine() ?: 0
//    println("Your age is $age")
//}
/*
* Output = >
Please enter your name :
Sandeep kumar
Your Name is : Sandeep kumar
Please Enter Your Age:
32
Your age is 32
* */

//
//fun main(){
//      generateRandomNumber()
//}
//fun generateRandomNumber(){
//    println("Print Random Number")
//   val random =  Random.nextInt()
//   val random1 =  Random.nextInt(9)
//   val random2 =  Random.nextInt(20,39)
//    println(random)
//    println(random1)
//    println(random2)
//}

//fun main(){
//    println("Please Enter Your Name: ")
//    val name= readlnOrNull()
//    println("Hi $name ,Welcome Back Home.")
//}

//fun main() {
//    println("Please Enter A Number: ")
//    val number = readlnOrNull()
//    val multiNumber: Int = if (number!!.isEmpty()) 0 else number.toInt() * 5
//    println("$number * 5 is: $multiNumber")
//}

fun main(){
    println("Please Enter Your Birth Year: ")
    val year = readlnOrNull()
    //to get current year from Calendar => Calendar.getInstance().get(Calendar.YEAR)
    val age  = Calendar.getInstance().get(Calendar.YEAR) - year!!.toInt()
    println("Your current age is $age")
}