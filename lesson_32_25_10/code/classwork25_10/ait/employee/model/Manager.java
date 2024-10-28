package classwork25_10.ait.employee.model;

//- создать дочерние классы Manager, SalesManager и Worker, реализовать в них методы начисления зарплаты:
//- Manager: base + grade*hours
public class Manager extends Employee {// наследование от Employee

    private double baseSalary;
    private  int grade;

//конструктор
    public Manager(int id, String name, String secondName, double hours, double baseSalary, int grade) {
        super(id, name, secondName, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

//геттеры и сеттеры
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {//метод для начисления З/П
        double salary = baseSalary + hours * grade;
        return ensureSalary(salary);//ensureSalary - проверка, что мы не начислили меньше чем минимум
    }

}
