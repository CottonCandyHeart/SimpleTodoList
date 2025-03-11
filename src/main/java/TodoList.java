import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        this.tasks.add(task);
    }
    public void removeTask(Task task){
        if (this.tasks.isEmpty()) throw new NoSuchElementException("Empty List");

        this.tasks.remove(task);
    }
    public void showTasks(){
        for (Task t : this.tasks){
            System.out.println(t.showTask());
        }
    }
    public void setTaskDone(Task task){
        if (!this.tasks.contains(task)) throw new NoSuchElementException("Element doesn't exist");

        for (Task t : this.tasks){
            if (t == task){
                t.setIsDone(true);
                break;
            }
        }
    }
    public void setTaskUndone(Task task){
        if (!this.tasks.contains(task)) throw new NoSuchElementException("Element doesn't exist");

        for (Task t : this.tasks){
            if (t == task){
                t.setIsDone(false);
                break;
            }
        }
    }
    public void changeTaskName(Task task, String newName){
        if (!this.tasks.contains(task)) throw new NoSuchElementException("Element doesn't exist");

        for (Task t : this.tasks){
            if (t == task){
                t.setName(newName);
                break;
            }
        }
    }
    public void changeTaskDescription(Task task, String newDescription){
        if (!this.tasks.contains(task)) throw new NoSuchElementException("Element doesn't exist");

        for (Task t : this.tasks){
            if (t == task){
                t.setDescription(newDescription);
                break;
            }
        }
    }

    public ArrayList<Task> getTasks(){
        return this.tasks;
    }
    public Task getTaskById(int id){
        if (this.tasks.isEmpty()) throw new NoSuchElementException("Empty List");

        return this.tasks.get(id);
    }
}
