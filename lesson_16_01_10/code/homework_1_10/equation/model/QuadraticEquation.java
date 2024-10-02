package homework_1_10.equation.model;
//Задача 4.(*) Создать класс QuadraticEquation в пакете equation.model.+
//В этом классе определить поля private double a; private double b; private double c;.+
//Создать конструктор public QuadraticEquation(double a, double b, double c) для инициализации полей.+
//Создать геттеры и сеттеры.+
//Создать метод public void display() для печати в консоль квадратного уравнения.+
//Создать методы public double delta() и public int quantityRoots() для вычисления дискриминанта и количества решений уравнения соответственно.
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

//метод public void display() для печати в консоль квадратного уравнения
//Квадратное уравнение — это уравнение вида ax² + bx + c = 0, где коэффициенты a, b и c — произвольные числа, причём a ≠ 0.
    public void display() {

        String equation = a + "x^2 "; // equation - уравнение

        if (b >= 0) {// Добавляем знак перед b
            equation += "+ " + b + "x ";
        } else {
            equation += "- " + Math.abs(b) + "x ";
        }

        if (c >= 0) {// Добавляем знак перед c
            equation += "+ " + c;
        } else {
            equation += "- " + Math.abs(c);
        }
        equation += " = 0";

        System.out.println(equation); // Печатаем уравнение
    }
}
