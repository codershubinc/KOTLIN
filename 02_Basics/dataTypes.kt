fun main() {
    // 🔢 Integers
    val age: Int = 21
    val bigNumber: Long = 1_000_000_000
    val shortNumber: Short = 32000
    val byteNumber: Byte = 127
    println("Int: $age, Long: $bigNumber, Short: $shortNumber, Byte: $byteNumber")

    // 🔢 Floating Point
    val pi: Float = 3.14f
    val e: Double = 2.7182818284
    println("Float: $pi, Double: $e")

    // 🔤 Characters and Strings
    val letter: Char = 'K'
    val name: String = "Kotlin"
    println("Char: $letter, String: $name")

    // ✅ Boolean
    val isKotlinFun: Boolean = true
    println("Boolean: $isKotlinFun")

    // 🔁 Array
    val arr = arrayOf(10, 20, 30)
    println("🔁  Array: ${arr.joinToString()}")

    // 📋 Immutable List
    val immutableList = listOf("Java", "Python", "Kotlin")
    println("Immutable List: $immutableList")

    // ✏️ Mutable List
    val mutableList = mutableListOf("C", "C++")
    mutableList.add("Rust")
    println("Mutable List: $mutableList")

    // 📚 Set (no duplicates)
    val set = setOf(1, 2, 2, 3)
    println("Set: $set")  // Output: [1, 2, 3]

    // 🔁 Mutable Set
    val mutableSet = mutableSetOf(1, 2)
    mutableSet.add(3)
    println("Mutable Set: $mutableSet")

    // 🔑 Map (key-value pairs)
    val map = mapOf("name" to "Swap", "language" to "Kotlin")
    println("Map: $map")

    // ✏️ Mutable Map
    val mutableMap = mutableMapOf("x" to 10)
    mutableMap["y"] = 20
    println("Mutable Map: $mutableMap")
}
