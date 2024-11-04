package homework.petsFromLesson18.model;

public class Dog extends Pets {//делаем наследование из родительского класса Pets

    //задаем еще одно поле: порода
    String breed;

    //конструктор
    public Dog(int id, String type, int age, String name, String breed) {
        super(id, type, age, name);
        this.breed = breed;
    }

    //геттер
    public String getBreed() {
        return breed;
    }

    // Реализация абстрактного метода для собаки
    @Override
    public double getDailyCost() {
        return 15.0; // предполагаем, что стоимость содержания собаки в день будет 15 евро
    }

}
