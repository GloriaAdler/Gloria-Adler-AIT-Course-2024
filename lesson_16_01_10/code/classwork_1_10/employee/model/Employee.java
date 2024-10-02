package classwork_1_10.employee.model;

//- создадим класс Employee (работник):
//  - поля
//  - конструктор
//  - геттеры и сеттеры
//  - метод display
// - создадим класс FirmaAppl, в котором:
//  - создаем объекты типа Employee
//  - определим зарплату и вычислим ее общую сумму.

public class Employee {
    //field
    private int id; //private в полях используют, чтобы другие программисты ничего не могли изменить в классе. А вот класс публичный, чтобы была возможность классом пользоваться
    private String name;
    private String lastName;
    private double selary;
    private boolean gender;

    //constructor
    public Employee(int id, String name, String lastName, double selary, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.selary = selary;
        this.gender = gender;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSelary() {
        return selary;
    }

    public void setSelary(double selary) {
        this.selary = selary;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String displayEmployee(){
        return String.format("ID: %d, name: %s, lastname: %s, salary: %.2f; gender: %s", id, name, lastName, selary, gender);

    }
}
