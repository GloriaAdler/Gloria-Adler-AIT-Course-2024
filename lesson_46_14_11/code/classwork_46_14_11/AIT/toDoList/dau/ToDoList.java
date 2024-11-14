package classwork_46_14_11.AIT.toDoList.dau;
import classwork_46_14_11.AIT.toDoList.model.Task;
import java.util.List;

public interface ToDoList {

    boolean addTask(Task task);// add Task

    Task removeTask(int taskNumber); // remove Task

    void viewTasks(); // print list of Tasks

    List<Task> getAllTasks(); // взять весь список

    int quantity(); // quantity of tasks

    void saveTasks(String fileName);

    void loadTasks(String fileName);
}
