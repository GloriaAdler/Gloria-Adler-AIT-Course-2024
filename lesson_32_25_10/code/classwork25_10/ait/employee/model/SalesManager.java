package classwork25_10.ait.employee.model;

//- создать дочерние классы Manager, SalesManager и Worker, реализовать в них методы начисления зарплаты:
//- SalesManager: salesValue * percent
public class SalesManager extends Employee {

    private double salesValue;
    private double percent;

//конструктор
    public SalesManager(int id, String name, String secondName, double hours, double salesValue, double percent) {
        super(id, name, secondName, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

//геттеры и сеттеры
    public double getSalesValue() {
        return salesValue;
    }
    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }
    public double getPercent() {
        return percent;
    }
    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double calcSalary() {//метод для начисления З/П
        double salary = salesValue * percent;
        return ensureSalary(salary);
    }
}
