package homework.interfaces;

public class PersonalTask implements TodoItem {

    private String description;
    private boolean completed;

    public PersonalTask(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {return description;}

    public void setDescription() {this.description = description;}

    @Override
    public void complete() {
        completed = true;
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }
}
