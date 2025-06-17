package homework.mvc_design_pattern;

public class TaskAlreadyExistsException extends Exception {

    public TaskAlreadyExistsException(String message){
        super(message);
    }

}
