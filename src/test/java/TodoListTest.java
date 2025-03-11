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
    void shouldSetTaskDone(){
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Do the laundry", "Only dark cloths");
        todoList.addTask(task);
        todoList.setTaskDone(task);

        assertTrue(todoList.getTaskById(0).getIsDone());
    }

    @Test
    void shouldSetTaskUndone(){
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Do the laundry", "Only dark cloths");
        task.setIsDone(true);
        todoList.addTask(task);
        todoList.setTaskUndone(task);

        assertFalse(todoList.getTaskById(0).getIsDone());

    }

    @Test
    void shouldChangeTaskName(){
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Clean room", "Clean my room because it's dirty");
        todoList.addTask(task);

        todoList.changeTaskName(task, "Clean bedroom");

        assertEquals("Clean bedroom", todoList.getTaskById(0).getName());
    }

    @Test
    void shouldChangeTaskDescription(){
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Clean bedroom", "Clean my room because it's dirty");
        todoList.addTask(task);

        todoList.changeTaskDescription(task, "Clean my bedroom because it's dirty");

        assertEquals("Clean my bedroom because it's dirty", todoList.getTaskById(0).getDescription());
    }

}
