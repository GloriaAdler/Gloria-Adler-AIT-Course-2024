package homework_18_10.student.model;
//Задача 2. Создать класс Студент (Student) с приватными полями:
//id+
//имя+
//фамилия+
//год рождения+
//специализация+

//Стандартные методы:
//конструктор на все поля;+
//геттеры и сеттеры на все поля;+
//метод display.+

//Дополнительные методы:
//учиться+
//взять отпуск+
//сдать экзамен+

public class Student {

    private int id;
    private String name;
    private String lastname;
    private int yearOfBirth;
    private String specialization;

    //constructor
    public Student(int id, String name, String lastname, int yearOfBirth, String specialization) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public int setId(int id) {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String setLastname(String lastname) {
        return lastname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int setYearOfBirth(int yearOfBirth) {
        return yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public String displayStudent (){
        return String.format("ID %d, name: %s, lastname: %s, year of birth: %d, sp: %s", id, name, lastname, yearOfBirth, specialization);
    }

   public void mustStudy (){
        System.out.println("Student must study.");
    }
    public void mustTakeVacation (){
       System.out.println("Student must take a vacation.");
    }
    public void mustPassExam (){
        System.out.println("Student must pass the exam.");
    }
}
