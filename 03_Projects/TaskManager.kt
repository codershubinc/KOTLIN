// defined data type class for task

data class Task(val id: Int, var description: String, var isDone: Boolean)

fun main() {
    val tasks = loadTasksFromFile()
    var taskIdCounter = (tasks.map { it.id }.max() ?: 0) + 1

    while (true) {
        println(
                "----------------------------------------- end task ----------------------------------------------"
        )
        println("Current Tasks:")
        println(tasks.toString())
        println(taskMenu())
        print("Enter choice: ")
        when (readLine()?.toIntOrNull()) {
            1 -> taskIdCounter = addTask(tasks, taskIdCounter)
            2 -> showTasks()
            3 -> markTaskAsDone(tasks)
            4 -> deleteTask(tasks)
            5 -> editTask(tasks)
            6 -> {
                println("Exiting... 👋 by ,,,,,,,,")
                return
            }
            else -> println("Invalid choice. Try again.")
        }
    }
}
