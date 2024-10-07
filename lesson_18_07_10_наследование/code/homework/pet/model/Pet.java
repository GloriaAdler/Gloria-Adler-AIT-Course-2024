package homework.pet.model;
// В классе Pet имеются поля:
//id
//вид
//возраст
//кличка
//Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog. Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.
public class Pet {
    String id;
    String type;
    int age;
    String name;

    public Pet(String id, String type, int age, String name) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void voice() {
        System.out.println("This pet makes a sound.");
    }
}
