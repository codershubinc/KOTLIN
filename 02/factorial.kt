// ✅ 05. Write a Kotlin function factorial(n: Int): Int that:
// Returns the factorial of a number (e.g., 5! = 120)

// Use a for loop (not recursion)

// Call the function with n = 5 and print the result

fun factorial(num: Int): Int {
    var result = 1

    if (num < 0) return 0

    for (i in 1..num) {
        result *= i
    }
    return result
}

fun main() {
    val n = 0
    val fact = factorial(n)
    println("Factorial of $n is $fact")
}
