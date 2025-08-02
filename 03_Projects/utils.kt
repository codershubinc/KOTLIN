fun addTask(tasks: MutableList<Task>, taskIdCounter: Int): Int {
    println("Adding Task...")
    print("Enter description: ")
    val description = readLine() ?: ""
    tasks.add(Task(taskIdCounter, description, false))
    saveTasksToFile(tasks)
    println("Task added successfully!")
    return taskIdCounter + 1
}

// Show tasks from file

fun showTasks() {
    val tasks = loadTasksFromFile()
    println("Current Tasks:")
    if (tasks.isEmpty()) {
        println("No tasks available.")
    } else {
        for (task in tasks) {
            println(
                    "${task.id}. ${task.description} - ${if (task.isDone) "[Done]" else "[pending]"}"
            )
        }
    }
}

fun markTaskAsDone(tasks: MutableList<Task>) {
    print("Enter Task ID to mark as done: ")
    val markId = readLine()?.toIntOrNull()

    val taskToMark = tasks.find { it.id == markId }
    if (taskToMark != null) {
        if (!taskToMark.isDone) {
            taskToMark.isDone = true
            saveTasksToFile(tasks)
            println("Task ID ${taskToMark.id} marked as done ✅")
        } else {
            println("Task is already marked as done.")
        }
    } else {
        println("Task not found ❌")
    }
}

fun deleteTask(tasks: MutableList<Task>) {
    print("Enter Task ID to delete: ")
    val deleteId = readLine()?.toIntOrNull()

    val taskToDelete = tasks.find { it.id == deleteId }
    if (taskToDelete != null) {
        tasks.remove(taskToDelete)
        saveTasksToFile(tasks)
        println("Task ID ${taskToDelete.id} deleted successfully 🗑️")
    } else {
        println("Task not found ❌")
    }
}

fun taskMenu(): String {
    val tasksMenu =
            mutableListOf<String>(
                    "1️⃣ 1  Add Task",
                    "2️⃣ 2  Show Tasks",
                    "3️⃣ 3  Mark as Done",
                    "4️⃣ 4  Delete Task",
                    "5️⃣ 5  Exit"
            )
    return tasksMenu.joinToString("\n")
}
