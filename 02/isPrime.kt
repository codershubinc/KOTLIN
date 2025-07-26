// ✅ 08. Next Challenge: Write a function isPrime(n: Int): Boolean that:
// Returns true if n is a prime number, otherwise false

// Use a for loop to check divisibility (skip 0 and 1)

// Test with n = 7, n = 10

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false // 0 and 1 are not prime numbers
    for (i in 2 until n) {
        if (i * i > n) break // No need to check beyond the square root of n
        if (n % i == 0) return false // Found a divisor, not prime
    }
    return true
}

fun main() {
    val testNumbers = listOf(7, 2, 3, 4, 6, 10)
    for (n in testNumbers) {
        if (isPrime(n)) {
            println("$n is a prime number")
        } else {
            println("$n is not a prime number")
        }
    }
}
