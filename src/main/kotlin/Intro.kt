// This is inline comment
/*
* This is a multiple lines comment
* */

// The simples main function in kotlin
//fun main() = println("Hello world!")

fun main(args: Array<String>) {
    println(args.contentToString())
    println("Sum of 10 and 3 is ${sum(10, 3)}")
    println("getFive returns ${getFive()}")
    println("sub two squared values return ${sub(10, 2)}")
}

// Functions
fun sum(a: Int, b: Int) = a + b

// variables

// Read-only local variables are declared as such:
fun sub(a: Int, b: Int): Int {
    val aSquared = a * a
    val bSquared = b * b
    val c = bSquared.minus(aSquared)
    return c
}

// There is inferred types in

fun getFive(): Int {
    var v = 6
    --v
    return v
}

class shape

class Rectangle(var height: Double, var width: Double) {
    var perimeter = (height + width) / 2
}


