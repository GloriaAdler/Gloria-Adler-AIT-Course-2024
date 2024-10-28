package classwork25_10.ait.employee.dao;

import classwork25_10.ait.employee.model.Employee;
import classwork25_10.ait.employee.model.SalesManager;

import java.util.Arrays;
import java.util.function.Predicate;

public class CompanyImpl implements Company {//наследование из интерфейса, имплементируем только МЕТОДЫ из интерфейса

    private Employee[] employees;//массив сотрудников
    private  int size;//реальное кол-во сотрудников

    public CompanyImpl(int capacity) {//создаем конструктор и переделываем его под себя. capacity- максимальное кол-во сотрудников, в нашем представлении, например мы планируем что в компании будет работать 1000 человек, значит наша вместимость capacity будет равна 1000.
        this.employees = new Employee[capacity];
        this.size = size;//реальное кол-во сотрудников
    }

    @Override
    public boolean addEmployee(Employee employee) {
        //bad cases
        if (employee == null){
            return false;
        }
        if (size == employees.length){//если они равны, мы не можем добавить
            return false;
        }
        if (findEmployee(employee.getId()) != null){//(findEmployee(employee.getId()) - этот кусок возвращает сотрудника с нужным id;
            return false;
        }
        //good cases
        employees[size] = employee;//[size] - первое свободное место в массиве
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                Employee victim = employees[i];
                System.arraycopy(employees, i+1, employees, i, size-i-1);
                employees [--size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                return employees [i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        //отыскать нужного в массиве и обновить ему поля, забирая их гетерами из объекта, который нам прислали - employee
        for (int i = 0; i < size; i++) {
            if (employees [i].getId() == employee.getId()) {//employees [i].getId() - текущий массив, employee.getId() - объект с которым сравниваем
                //employees [i].setSecondName(employee.getSecondName());//1й способ
                //employees [i].setHours(employee.getHours());//1й способ
                employees [i] = employee;//общий способ
                return employees [i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;//return всегда size
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {//i < size - пройдем только заполненную часть массива
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;
    }

    @Override
    public double averageSalary() {
        return totalSalary()/size;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i]instanceof SalesManager){//обязательная проверка перед кастингом - instanceof, кастинг должен быть безопасным!!! иначе будут вылезать ошибки
                SalesManager sm = (SalesManager) employees[i];//sm - правильного типа объект, только после этого можно вытащить getSalesValue. (SalesManager) - это безопасный кастинг
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeeByPredicate(e -> e.getHours() > hours);

    }

    @Override
    public Employee[] findEmployeesSalaryRange(double min, double max) {
        return findEmployeeByPredicate(e -> e.calcSalary()>min && e.calcSalary() < max);
    }

    private Employee[] findEmployeeByPredicate(Predicate <Employee> predicate) {

        Employee[] res = new Employee[size];
        int j = 0; //это индексы массива
        for (int i = 0; i < size; i++) {
            if (predicate.test(employees[i]));
            res[j++] = employees[i];
        }
        return Arrays.copyOf(res, j);//таким способом обрезаем "хвост" из null
    }
}//end of class
