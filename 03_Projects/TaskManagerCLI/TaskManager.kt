// defined data type class for task

data class Task(val id: Int, var description: String, var isDone: Boolean)

fun main() {
    val utils = TaskManagerUtils()
    val tasks = loadTasksFromFile()
    var taskIdCounter = (tasks.map { it.id }.max() ?: 0) + 1

    while (true) {
        println(
                "----------------------------------------- end task ----------------------------------------------"
        )
        println("Current Tasks:")
        println(tasks.toString())
        println(utils.taskMenu())
        print("Enter choice: ")
        when (readLine()?.toIntOrNull()) {
            1 -> taskIdCounter = utils.addTask(tasks, taskIdCounter)
            2 -> utils.showTasks()
            3 -> utils.markTaskAsDone(tasks)
            4 -> utils.deleteTask(tasks)
            5 -> utils.editTask(tasks)
            6 -> {
                println("Exiting... 👋 by ,,,,,,,,")
                return
            }
            else -> println("Invalid choice. Try again.")
        }
    }
}
