package classwork_1_10.car_object.model;

public class Car {

    //Это всё абстрагирование; мы описали поля нашего объекта
    //поля класса
    private String barand;//private -пока скрываем, String - тип (для строки), barand - название
    private int year;
    private  double price;
    private String color;
    private boolean isNew; //вывод будет правда или ложь: новая или старая


    //делается это всё с помощью constructor, он соберет все выше указанные типы и соберет в один тип (наш собственный)
//правая кнопка мыши-->Generate-->constructor

    //constructor - это метод, но он ничего не возвращает. Здесь метод называется по имени класса с большой буквы, не требует статик!
    public Car(String barand, int year, double price, String color, boolean isNew) {//в скобках это аргументы, с помощью которого можно создать объект
        this.barand = barand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.isNew = isNew;
    }

    //getters and setters - это методы, которые используются для получения и изменения значений полей (переменных) объекта. Они помогают обеспечить контроль над доступом к данным, инкапсулируя (скрывая) внутренние детали объекта.
//Getter: Метод, который возвращает значение переменной.
//Setter: Метод, который изменяет (устанавливает) значение переменной.

//правая кнопка мыши-->Generate-->Getters and Setters

    public String getBarand() {
        return barand;
    }

    public void setBarand(String barand) {
        this.barand = barand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    //метод собирающий строку автоматически из выше заданных параметров
    //правая кнопка мыши-->Generate-->toString

    public String display() {
        return "Car{" +
                "barand='" + barand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    public  void move (){
        System.out.println("Car is moving...");
    }

    public void stop (){
        System.out.println("Car stopped.");
    }



}


