public class Task {
    private int id;
    private String name;
    private String description;
    private boolean isDone;

    public Task(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isDone = false;
    }

    public String showTask(){
        return (this.isDone ? "DONE " : "____ ") + id + ". " + name + ":\n\t\t" + description;
    }

    // ------- GETTERS & SETTERS -------
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public boolean getIsDone(){
        return this.isDone;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }
}
