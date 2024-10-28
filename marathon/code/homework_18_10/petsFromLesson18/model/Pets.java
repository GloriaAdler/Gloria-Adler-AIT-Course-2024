package homework_18_10.petsFromLesson18.model;

public abstract class Pets {

    //задаем поля: номер, вид, возраст, имя
    protected int id;
    protected String type;
    protected int age;
    protected String name;

    //конструктор на все поля
    public Pets(int id, String type, int age, String name) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.name = name;
    }

    //геттеры на все поля
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод, который будут реализовывать дочерние классы
    public abstract double getDailyCost();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pets{");
        sb.append("id=").append(id);
        sb.append(", type='").append(type).append('\'');
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
