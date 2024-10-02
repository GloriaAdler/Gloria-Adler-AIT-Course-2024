package homework_03;

//Метод вычисляющий площадь круга по его радиусу
//площадь круга для R = 200 равна ...

public class Circle {

    public static double area(double radius) { // площади круга: S = PI * r^2

        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {

        double radius = 200.0;

        double area = area(radius); // площадь круга

        System.out.println("Площадь круга для радиуса " + radius + " равна: " + area);
    }
}


