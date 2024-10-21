package classwork_18_10.ait.employee.dao;

import classwork_18_10.ait.employee.model.Employee;
import classwork_18_10.ait.employee.model.SalesManager;

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
                employees[i] = employees[size-1];//на место жертвы копируем (ставим) последний элемент массива
                employees[size-1] = null;//последний элемент затрем с помощью null, [size] - это последняя пустая ячейка, поэтому -1
                size--;
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

    //!!!!!
    @Override
    public Employee updateEmplyee(Employee employee) {
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
//!!!!!
    @Override
    public double averageSalary() {
        return totalSalary()/size;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i]instanceof SalesManager){//обязательная проверка перед кастингом, кастинг должен быть безопасным!!! иначе будут вылезать ошибки
                SalesManager sm = (SalesManager) employees[i];//sm - правильного типа объект, только после этого можно вытащить getSalesValue. (SalesManager) - это безопасный кастинг
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public Employee[] findEmployeeHoursGreateThan(int hours) {// Метод для поиска сотрудников, которые отработали больше заданного числа часов
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours){ // Считаем количество сотрудников, которые отработали больше часов
                count++;
            }
        }//После подсчёта создаём массив overworkedEmployees (количество переработавших сотрудников).
       // Создаем массив для сотрудников с переработками
        Employee[] overworkedEmployees = new Employee[count];
        int index = 0;
        for (int i = 0; i < size; i++) {// Заполняем массив сотрудниками с переработками
            if (employees[i].getHours() < hours) {
                overworkedEmployees[index] = employees[i];
                index++;
            }
        }
        return overworkedEmployees;
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        int count = 0; // Считаем количество сотрудников в заданном диапазоне
        for (int i = 0; i < size; i++) {
            if (employees[i].calcSalary() > min && employees[i].calcSalary() < max){
                count++;
            }
        }
        // Создаем массив для сотрудников с зарплатой в диапазоне
        Employee[] employeesInRange = new Employee[count];
        int index = 0;
        // Заполняем массив сотрудниками с зарплатой в диапазоне
        for (int i = 0; i < size; i++) {
            if (totalSalary() >= min && totalSalary() <= max) {
                employeesInRange[index] = employees[i];
                index++;
            }
        }
        return employeesInRange;
    }
}//end of class
