package ch_4_variabls_and_strings

import java.util.*

/*
* String is surrounded by "" while a Character (Char) is surrounded by ''
* In String we directly can not use " and \
* to use " and \ we need to add escape operator \ like-> \" and \\
* */
fun main() {
//    val str = "Sandeep Kumar \"Singh\""
//    val str1 = "Sandeep Kumar \\"
//    println(str)
//    println(str1)

//    val name  ="My cate name is \"Flffy\""
//    val slesh = "Two type of slash is: \\ and /"
//    val url ="http://www.google.com"
//    println(name)
//    println(slesh)
//    println(url)
//    println("Sandeep $url ${1+1}")
//    println("""
//        (\(\
//        (-.-)
//        O_(")(")
//    """.trimIndent())

    strFunctionDemo()
}
/* Output ->
My cate name is "Flffy"
Two type of slash is: \ and /
http://www.google.com
(\(\
(-.-)
O_(")(")
*/


//String Functions
fun strFunctionDemo(){
    var str1 ="SaNdeep "
    val r1 =str1.length
    val r2 = str1.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.titlecase(Locale.getDefault()) }
    val r3 = str1.replaceFirstChar { it.lowercase(Locale.getDefault()) }
    val r4 = str1.uppercase(Locale.getDefault())
    val r5 = str1.lowercase(Locale.getDefault())
    val r6 = str1.trim()
    val r7 =str1.get(2)
    val r8 = str1[2]
    val r9 = str1.substring(2)
    val r10 = str1.substring(2,5)

    val client = "Mary"
    val products = 3
    val price = 30
    println("$client need to pay: ${products * price} \u20A8")

    println(r1)
    println(r2)
    println(r3)
    println(r4)
    println(r5)
    println(r6)
    println(r7)
    println(r8)
    println(r9)
    println(r10)
}