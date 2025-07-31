// ✅ 03. Define a function greetUser that:
// Accepts a name: String

// Returns a greeting like "Hello, [name]!"

// Call it inside main() with your name and print the result

fun greetUser(name: String): String {
    return "Hello, $name!"
}

fun main() {
    val greeting = greetUser("swap")
    println(greeting)
}
