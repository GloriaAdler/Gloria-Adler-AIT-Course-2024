package homework_1_10.modelPet;
//Задача 1. Создать класс Pet (Домашнее животное) с приватными полями:
//id +
//вид+
//возраст+
//кличка+

//Стандартные методы:
//конструктор на все поля;+
//геттеры и сеттеры на все поля;+
//метод toString.+

//Дополнительные методы:
//спать
//есть
//делать звук
//играть
//гулять

public class Pet {
    private int id;
    private String breed;
    private int age;
    private String nickname;

    //constructor
    public Pet(int id, String breed, int age, String nickname) {
        this.id = id;
        this.breed = breed;
        this.age = age;
        this.nickname = nickname;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public String display() {
        return "Pet{" +
                "id=" + id +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    //Доп.методы
    public void sleep (){
        System.out.println("Pet sleep.");
    }

    public void eat (){
        System.out.println("Pet eat.");
    }

    public void makeSound (){
        System.out.println("Pet do sound");
    }

    public void play (){
        System.out.println("Pet play.");
    }

    public void walk (){
        System.out.println("Pet walk.");
    }


}
