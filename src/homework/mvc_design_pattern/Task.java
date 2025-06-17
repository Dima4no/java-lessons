package homework.mvc_design_pattern;

import java.util.UUID;

public class Task {

    private String description;
    private boolean isCompleted;

    private UUID uniqueID;

    public Task(String description) {
        uniqueID = UUID.randomUUID();
        this.description = description;
        this.isCompleted = false;
    }

    public UUID getId() {
        return uniqueID;
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
        return "Task: " + uniqueID + ", " + description + " is " + (isCompleted ? "Done" : "Pending");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            Task taskToCompare = (Task) obj;
            return taskToCompare.getDescription().equals(this.getDescription());
        }
    }
}
