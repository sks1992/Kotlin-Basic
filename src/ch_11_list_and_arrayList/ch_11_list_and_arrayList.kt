package ch_11_list_and_arrayList

/*
*
* */

fun main() {
//A zoo has a list of animals.
//
//val animals = arrayListOf(“lion”, “zebra”, “chimp”, “elephant”)
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    animals.add("panda")
    println(animals)
    animals.remove("lion")
    println(animals)
    val a = listOf("elephant", "giraffes")
    val isContain = animals.containsAll(a)
    println("Does the zoo have both elephants and giraffes :: $isContain")

//
//A new panda bear cub has arrived.
//
//Print out the new list of animals.
//
//The lion has been sold to a different zoo.
//
//Print out the new list of animals.
//
//Does the zoo have both elephants and giraffes?


}