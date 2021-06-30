/*
* Variable ->Variable are like a box that store data and we have give it a name
* whenever we need to store some value we need to create variable
*
* var ->Data can be reassign
*       mutable type
*       assign value at run time
*
* val->Data can't be reassign
*       immutable type
*       assign value at run time
*
* const ->Data can't be reassign
*       immutable type
*       assign value ata compile time
* */

/*
* Data Type
* Integer ->Byte,Short,Int,Long
* Floating Point ->Float,Double
* Boolean ->True,False
* Character -> Char,String
* */

const val KEY ="sandeep"

fun main() {
    var score =5
    println(score)

    score =10
    println(score)

    val points =20
    println(points)

    // points =32 ->Error =Val cannot be reassigned

    //const val result =20 ->Error =>Modifier 'const' is not applicable to 'local variable'


    var value:Int =10
   // value =10.0 Error =>The floating-point literal does not conform to the expected type Int

    var temp:Double =54.00
    println(temp)

    var alphabet:Char ='A'
    println(alphabet)

    var name:String ="Sandeep kumar"
    println(name)

    var isCoding:Boolean = true
    println(isCoding)

}

