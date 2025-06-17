package homework.mvc_design_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class TaskService {

    private List<Task> tasks;

    public TaskService() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) throws TaskAlreadyExistsException {
        if (tasks.contains(task)) {
            throw new TaskAlreadyExistsException("Task with this description already exists!");
        }
        tasks.add(task);
    }

    public boolean removeTask(UUID id) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public Task getTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

    public boolean markTaskAsDone(int id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                task.markAsDone();
                return true;
            }
        }
        return false;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public List<Task> getPendingTasks() {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.getIsCompleted()) {
                result.add(task);
            }
        }
        return result;
    }

    public List<Task> getCompletedTasks() {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getIsCompleted()) {
                result.add(task);
            }
        }
        return result;
    }
}
