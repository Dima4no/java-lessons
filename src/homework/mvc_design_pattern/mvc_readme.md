# ✅ Task Management System - MVC & List Exercise

## 📌 Scenario

In this exercise, you will implement a **Task Management System** in Java using the **MVC (Model-View-Controller) design pattern**. The system will allow users to **manage their tasks** through a command-line interface, where they can add, remove, mark as done, and filter tasks.

Tasks will be stored in a **List**, and all user interactions will be handled through the `Scanner` class.

To improve structure and maintainability, we will **add a Service Layer** that acts as an intermediary between the **Controller** and the **data storage**.

---

## 🏗️ Task Description

### 1️⃣ Create the **Model** - `Task` Class

- Define the following **instance variables**:
    - `id` (int) - A unique identifier for the task.
    - `description` (String) - A brief description of the task.
    - `isCompleted` (boolean) - Indicates if the task is marked as done.

- Implement the **constructor** to initialize these fields.

- Implement the following methods:
    - `markAsDone()` - Marks the task as **completed**.
    - `toString()` - Returns a **formatted string** representation of the task.

---

### 2️⃣ Create the **Service** - `TaskService` Class

- This class will **manage data storage** (acting as a "database").
- Stores tasks in a `List<Task>`.
- Implements the following methods:
    - `addTask(Task task)`: Adds a task to the list.
    - `removeTask(int id)`: Removes a task by ID.
    - `getTaskById(int id)`: Finds and returns a task by ID.
    - `markTaskAsDone(int id)`: Marks a task as completed.
    - `getAllTasks()`: Returns all tasks.
    - `getPendingTasks()`: Returns only **pending** tasks.
    - `getCompletedTasks()`: Returns only **completed** tasks.
- If you think that you need more methods for the program to work that I didn't mention here, feel free to add them.

---

###  3️⃣ Create the **View** - `TaskView` Class (Handles ALL User Interaction)

- Uses `Scanner` to **interact with the user**.
- Implements the following methods:
  - `displayMenu()`: Shows the list of actions users can take.
  - `displayMessage(String message)`: Prints a message to the user.
  - `displayError(String message)`: Prints an error message to the user.
  - `readInt()`: Reads an integer input from the user.
  - `readString()`: Reads a string input from the user.
- If you think that you need more methods for the program to work that I didn't mention here, feel free to add them.


### 4️⃣ Create the **Controller** - `TaskController` Class

- This class will **control** the system flow and delegate tasks to the **Service** and **View** layers.
- It needs to have 2 instance variables: `TaskService` and `TaskView`.
- Implements the following methods:
    - `handleAddTask(String description)`: Calls `TaskService` to add a new task.
    - `handleRemoveTask(int id)`: Calls `TaskService` to remove a task.
    - `handleMarkTaskAsDone(int id)`: Calls `TaskService` to mark a task as completed.
    - `handleDisplayTasks()`: Calls `TaskService` and sends the list to `TaskView` for display.
    - `handleDisplayPendingTasks()`: Calls `TaskService` and sends only **pending** tasks to `TaskView`.
    - `handleDisplayCompletedTasks()`: Calls `TaskService` and sends only **completed** tasks to `TaskView`.

  Create another method run() that will:
- Display the **menu**, such as "Press 1 to add a task", "Press 2 to remove a task", etc... Press 0 to exit.
- Continuously (using a while(true)) prompt the user for actions:
  - Add a new task.
  - Remove a task.
  - Mark a task as done.
  - View all tasks.
  - View pending tasks.
  - View completed tasks.
  - Exit the program.

- If you think that you need more methods for the program to work that I didn't mention here, feel free to add them.

---

### 5️⃣ Create the **Main** Method in `Main`

- Instantiate the controller and call the run method which should take care of the rest
---

## 🎯 Expected Output Example

```plaintext
Welcome to Task Management System!
----------------------------------
1. Add a new task
2. Remove a task
3. Mark a task as done
4. View all tasks
5. View pending tasks
6. View completed tasks
7. Exit
----------------------------------
Enter your choice: 1
Enter task description: Finish Java project
Task added successfully!

Enter your choice: 1
Enter task description: Buy groceries
Task added successfully!

Enter your choice: 4
Tasks List:
[1] Finish Java project - ❌ To Do
[2] Buy groceries - ❌ To Do

Enter your choice: 3
Enter task ID to mark as done: 1
Task marked as done!

Enter your choice: 6
Completed Tasks:
[1] Finish Java project - ✅ Done

Enter your choice: 7
Exiting Task Manager...
