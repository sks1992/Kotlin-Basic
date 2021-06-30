fun main() {
    numberTable(5)
   /* for (i in 1..5) {
        println(i)
    }
    println("---------")
    for (j in 1..5 step 2) {
        println(j)
    }
    println("---------")

    for (k in 1 until 5) {
        println(k)
    }
    println("---------")

    for (i in 5 downTo 1) {
        println(i)
    }

    println("---------")

    for (i in 5 downTo 1 step 2) {
        println(i)
    }*/
}

fun numberTable(a:Int){
    for (i in 1..10)
    println(" $a * $i = ${a * i}")
}