package classwork_46_14_11.AIT.toDoList.test;

import classwork_46_14_11.AIT.toDoList.dau.ToDoList;
import classwork_46_14_11.AIT.toDoList.dau.ToDoListImpl;
import classwork_46_14_11.AIT.toDoList.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoListImplTest {

    ToDoList toDoList;
    LocalDate now = LocalDate.now();

    //в @BeforeEach строим тестовый набор данных
    @BeforeEach
    void setUp() {

        toDoList = new ToDoListImpl();

        toDoList.addTask(new Task("Do homework", now.minusDays(2)));
        toDoList.addTask(new Task("Buy products", now.minusDays(1)));
        toDoList.addTask(new Task("Walk with pets", now.minusDays(3)));

       // System.out.println(toDoList);
    }

    @Test
    void addTask() {//методы void никакими ассертами НЕ тестируются
        assertFalse(toDoList.addTask(null));
        assertFalse(toDoList.addTask(new Task("Do homework", now.minusDays(2))));
        Task task = new Task("clean", now.minusDays(1));
        assertTrue(toDoList.addTask(task));
        assertEquals(4, toDoList.quantity());
    }

    @Test
    void removeTask() {
        toDoList.removeTask(1);
        assertEquals(2, toDoList.quantity());
        toDoList.viewTasks();
    }

    @Test
    void viewTasks() {
        toDoList.viewTasks();
    }

    @Test
    void getAllTasks() {
        toDoList.getAllTasks();
        toDoList.viewTasks();
    }

    @Test
    void quantity() {
        assertEquals(3, toDoList.quantity());
    }
}
