import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {
    @Test
    void shouldAddTask(){
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Do the laundry", "Only dark cloths");
        todoList.addTask(task);

        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(task);

        assertEquals(taskList, todoList.getTasks());
    }

    @Test
    void shouldRemoveTask(){
        TodoList todoList = new TodoList();
        Task task1 = new Task(1, "Do the laundry", "Only dark cloths");
        Task task2 = new Task(2, "Take out the trash", "Kitchen, bathroom");
        todoList.addTask(task1);
        todoList.addTask(task2);

        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);

        todoList.removeTask(task1);
        taskList.remove(task1);

        assertEquals(taskList, todoList.getTasks());
    }

    @Test
    void shouldShowTasks(){

    }

    @Test
    void shouldSetTaskDone(){

    }

    @Test
    void shouldSetTaskUndone(){

    }

    @Test
    void shouldChangeTaskName(){

    }

    @Test
    void shouldChangeTaskDescription(){

    }

}
