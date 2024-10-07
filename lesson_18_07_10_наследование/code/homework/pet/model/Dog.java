package homework.pet.model;
//Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями:
//порода
//рост
//вес
public class Dog extends Pet{
    String breed;
    double height;
    double weight;

    public Dog(String id, String type, int age, String name, String breed, double height, double weight) {
        super(id, type, age, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public void voice() {//метод voice, который выдает "Гав-гав!" для класса Dog.
        System.out.println(name + " speak Gav-gav");
    }
}
