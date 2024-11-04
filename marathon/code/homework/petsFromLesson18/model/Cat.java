package homework.petsFromLesson18.model;

public class Cat extends Pets {

    //задаем еще одно поле: порода
    String breed;

    //конструктор
    public Cat(int id, String type, int age, String name, String breed) {
        super(id, type, age, name);
        this.breed = breed;
    }

    //геттер
    public String getBreed() {
        return breed;
    }

    //// Реализация абстрактного метода для кошки
    @Override
    public double getDailyCost() {
        return 10; //предполагаем, что стоимость содержания кошки в день будет 10 евро
    }

}
