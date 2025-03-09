public class Main {
    public static void main(String[] args) {
        Task t1 = new Task(1, "Clean room", "Clean my room because it's dirty");
        Task t2 = new Task(2, "Do the laundry", "Only dark cloths");
        Task t3 = new Task(3, "Take out the trash", "Kitchen, bathroom");

        TodoList todoList = new TodoList();

        todoList.addTask(t1);
        todoList.addTask(t2);
        todoList.addTask(t3);
        todoList.showTasks();
        System.out.println();

        todoList.setTaskDone(t2);
        todoList.showTasks();
        System.out.println();

        todoList.removeTask(t3);
        todoList.showTasks();
        System.out.println();

        todoList.changeTaskName(t1, "Clean bedroom");
        todoList.changeTaskDescription(t1, "Clean my bedroom because it's dirty");
        todoList.showTasks();
        System.out.println();

    }
}