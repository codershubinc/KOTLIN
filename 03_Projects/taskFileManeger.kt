import java.io.File

fun saveTasksToFile(tasks: List<Task>, filename: String = "tasks.txt") {
    val lines = tasks.map { "${it.id}|${it.description}|${it.isDone}" }
    File(filename).writeText(lines.joinToString("\n"))
}

fun loadTasksFromFile(filename: String = "tasks.txt"): MutableList<Task> {
    val tasks = mutableListOf<Task>()
    val file = File(filename)
    if (file.exists()) {
        file.forEachLine { line ->
            val parts = line.split("|")
            if (parts.size == 3) {
                val id = parts[0].toIntOrNull() ?: return@forEachLine
                val desc = parts[1]
                val isDone = parts[2].toBoolean()
                tasks.add(Task(id, desc, isDone))
            }
        }
    }
    return tasks
}
