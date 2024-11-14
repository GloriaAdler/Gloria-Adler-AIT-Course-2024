package classwork_45_13_11.employee_save_read;

import java.io.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SaveEmployeeAppl {
    public static void main(String[] args) {

    Address address1 = new Address("Berlin", "Rathausstr.", 13, 04, 10178);
    Address address2 = new Address("Berlin", "Müllstraße", 1, 8, 10178);

    Employee e1 = new Employee(1, "Peter", LocalDate.of(2000, 04, 01), 5900, address1);
    Employee e2 = new Employee(2, "Jacob", LocalDate.of(2000, 04, 10), 5800, address2);

    Set <Employee> firma= new HashSet<>();

    firma.add(e1);
    firma.add(e2);

    //отправляем в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {

            oos.writeObject(firma);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
