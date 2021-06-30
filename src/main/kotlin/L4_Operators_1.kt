/*
Arithmetic Operators
Relational Operators
Increment and Decrement

+, -, *, /, %  :- mathematical operators
* is also used to pass an array to a vararg parameter

=
assignment operator

is used to specify default values for parameters

+=, -=, *=, /=, %= :- augmented assignment operators

++, -- :- increment and decrement operators

&&, ||, ! :- logical 'and', 'or', 'not' operators (for bitwise operations, use corresponding infix functions)

==, != :- equality operators (translated to calls of equals() for non-primitive types)

===, !== :- referential equality operators

<, >, <=, >= :- comparison operators (translated to calls of compareTo() for non-primitive types)

[, ] :- indexed access operator (translated to calls of get and set)

!! asserts that an expression is non-null

?. performs a safe call (calls a method or accesses a property if the receiver is non-null)

?: takes the right-hand value if the left-hand value is null (the elvis operator)

:: creates a member reference or a class reference

.. creates a range

: separates a name from a type in declarations

? marks a type as nullable

->
separates the parameters and body of a lambda expression

separates the parameters and return type declaration in a function type

separates the condition and body of a when expression branch

@
introduces an annotation

introduces or references a loop label

introduces or references a lambda label

references a 'this' expression from an outer scope

references an outer superclass

; separates multiple statements on the same line

$ references a variable or expression in a string template

_
substitutes an unused parameter in a lambda expression

substitutes an unused parameter in a destructuring declaration
*/

fun main() {
    var i = 17
    var j = 2

    println(i + j) //19
    println(i - j) //15
    println(i * j) //34
    println(i / j) //8
    println(i.toFloat() / j) //8.5
    println(i % j) //1

    println(i < j) //17<2 false
    println(i > j) //17>2 true
    println(i <= j)//17 <= 2 false
    println(i >= j)//17 >= 2 true
    println(i == j)//17 == 2 false
    println(i != j)//17 != 2 true

    var a = 10
    //a++  post increment
    println(a++)//10
    //++a pre increment
    println(++a)//12
    //a-- post decrement
    println(a--)//12
    //--a pre decrement
    println(--a)//10

    println(a++ + ++a) //10 + 12 =22
}