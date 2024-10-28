package classwork25_10.ait.employee.dao;

import classwork25_10.ait.employee.model.Employee;

public interface Company {//это уже не класс, это интерфейс, создается в меню под новым джава-классом

//добавить сотрудника
    boolean addEmployee (Employee employee);//модификатор писать в интерфейсе не нужно, так как все модификаторы по умолчанию public
//удалить сотрудника
    Employee removeEmployee (int id);
//найти сотрудника
    Employee findEmployee (int id);
//обновить информацию о сотруднике
    Employee updateEmployee (Employee employee);
//количество
    int quantity();//quantity - количество
//печать
    void printEmployee();
//вся з/п
    double totalSalary ();//это будет з/п всех сотрудников
//средняя з/п
    double averageSalary();
//общий объем продаж
    double totalSales ();
//поиск переработок
    Employee[] findEmployeesHoursGreaterThan (int hours);//Employee[]- некий массив сотрудников, имем сверхурочные
//поиск максимальной и минимальной з/п
    Employee[] findEmployeesSalaryRange (double min, double max);//з/п минимальная и максимальная по списку сотрудников









}
