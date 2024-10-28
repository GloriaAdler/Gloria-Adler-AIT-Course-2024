package classwork25_10.ait.employee.model;

//- создать дочерние классы Manager, SalesManager и Worker, реализовать в них методы начисления зарплаты:
//- Worker: grade*hours
public class Worker extends Employee {

    private int grade;

//конструктор
    public Worker(int id, String name, String secondName, double hours, int grade) {
        super(id, name, secondName, hours);
        this.grade = grade;
    }
//геттер и сеттер
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {//метод для начисления З/П
        double salary = grade * hours;
        return ensureSalary(salary);
    }

}
