import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    void shouldShowTaskUndone(){
        int id = 1;
        String name = "Do the laundry";
        String description = "Only dark cloths";
        Task task = new Task(1, name, description);

        assertEquals("____ " + id + ". " + name + ":\n\t\t" + description, task.showTask());
    }

    @Test
    void shouldShowDone(){
        int id = 1;
        String name = "Do the laundry";
        String description = "Only dark cloths";
        Task task = new Task(1, name, description);
        task.setIsDone(true);

        assertEquals("DONE " + id + ". " + name + ":\n\t\t" + description, task.showTask());
    }
}
