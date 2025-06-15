package homework.mvc_design_pattern;

public class TaskController {

    private TaskService taskService;
    private TaskView taskView;

    public TaskController() {
        this.taskService = new TaskService();
        this.taskView = new TaskView();
    }


}
