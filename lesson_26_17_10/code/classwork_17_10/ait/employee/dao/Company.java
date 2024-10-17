package classwork_17_10.ait.employee.dao;

import classwork_17_10.ait.employee.model.Employee;

public interface Company {//это уже не класс, это интерфейс, создается в меню под новым джава-класс

    boolean addEmployee (Employee employee);//модификатор писать в интерфейсе не нужно, так как все модификаторы по умолчанию public

    Employee removeEmployee (int id);

    Employee findEmployee (int id);

    Employee updateEmplyee (Employee employee);

    int quantity();//quantity - количество

    void printEmployee();

    double totalSalary ();//это будет з/п всех сотрудников

    double totalSales ();

    Employee[] findEmployeeHoursGreateThan (int hours);//Employee[]- некий массив сотрудников, имем сверхурочные

    Employee[] findEmployeeSalaryRange (double min, double max);//з/п минимальная и максимальная по списку сотрудников









}
