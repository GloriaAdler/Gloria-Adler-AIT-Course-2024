package homework_05;
//Задача 2. Задать в программе три стороны треугольника.
           // Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
           // Сообщить результат - существует или нет треугольник с заданными сторонами.
public class Task_02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 3;

        if (trianglIsValid(a, b, c)) {
            System.out.println("Треугольник с заданными сторонами существует.");
        } else {
            System.out.println("Треугольник с заданными сторонами не существует.");
        }
    }

    public static boolean trianglIsValid(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
