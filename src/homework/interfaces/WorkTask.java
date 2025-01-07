package homework.interfaces;

public class WorkTask implements TodoItem {

    private String description;
    private boolean completed;

    public WorkTask(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    @Override
    public void complete() {
        completed = true;
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }
}
