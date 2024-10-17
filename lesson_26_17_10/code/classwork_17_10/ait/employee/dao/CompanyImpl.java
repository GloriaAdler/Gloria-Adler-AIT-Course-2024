package classwork_17_10.ait.employee.dao;

import classwork_17_10.ait.employee.model.Employee;

public class CompanyImpl implements Company {//наследование из интерфейса, имплиментируем только МЕТОДЫ из интерфейса

    private Employee[] employees;//массив сотрудников
    private  int size;//реальное кол-во сотрудников

    public CompanyImpl(int capacity) {//создаем конструктор и переделываем его под себя. capacity- максимальное кол-во сотрудников, в нашем представлении, например мы планируем что в компании будет работать 1000 человек, значит наша вместимость capacity будет равна 1000.
        this.employees = new Employee[capacity];
        this.size = size;//реальное кол-во сотрудников
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public Employee updateEmplyee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public Employee[] findEmployeeHoursGreateThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return new Employee[0];
    }
}
