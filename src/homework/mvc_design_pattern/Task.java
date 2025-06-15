package homework.mvc_design_pattern;

public class Task {

    private int id;
    private String description;
    private boolean isCompleted;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void markAsDone() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return "Task: " + id + ", " + description + " is " + (isCompleted ? "Done" : "Pending");
    }
}
