// ✅ 07. Challenge: Write a function maxOfTwo(a: Int, b: Int): Int that:
// Returns the larger of the two numbers a and b

// Use a simple if-else

// Call it with any two numbers in main() and print the result

fun maxOfTw(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    val a = 10
    val b = 20
    val max = maxOfTw(a, b)
    println("The larger number between $a and $b is $max")
}
