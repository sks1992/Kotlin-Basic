/*Logic Operators
* AND &&
* NOT !
* OR ||
*
*        true  true         false  false
*        true  false        true   false
*
* AND   true   false        false  false
* OR    true   true         true   false
* NOT   true ->false    ,   false ->true
* */

fun main() {
    val above70 =true
    val knowProgramming =true

    var callForInterView =above70 && knowProgramming
    println(callForInterView) //true

    callForInterView = above70 || knowProgramming
    println(callForInterView) //true

    val answer =true
    val result =!answer
    println(result) //false
}