import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }
    public void removeTask(Task task){
        tasks.remove(task);
    }
    public void showTasks(){
        for (Task t : tasks){
            System.out.println(t.showTask());
        }
    }

    public void setTaskDone(Task task){
        for (Task t : tasks){
            if (t == task){
                t.setIsDone(true);
                break;
            }
        }
    }

    public void setTaskUndone(Task task){
        for (Task t : tasks){
            if (t == task){
                t.setIsDone(false);
                break;
            }
        }
    }

}
