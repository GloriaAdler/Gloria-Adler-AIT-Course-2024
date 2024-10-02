package homework_03;

//Добавить методы, вычисляющие (*)
//Величину 3-го угла треугольника по известным первым двум.
//Площадь треугольника по стороне и высоте треугольника.
//Гипотенузу по двум катетам (теорема Пифагора).

public class Triangle {
    public static void main(String[] args) {
        // Вычисление величины третьего угла треугольника. Сумма углов в треугольнике всегда равна 180°.
        double angle1 = 50.0; // angle - угол
        double angle2 = 50.0;
        double angle3 = 180-angle1-angle2;

        System.out.println("Третий угол треугольника равен: " + angle3);

        // Площади треугольника. S = (1/2) * a * h, где. S - площадь треугольника, a - основание треугольника, h - длина высота.
        double base = 10.0; //length - длина
        double height = 5.0; //height - высота
        double area = area(base, height);
        System.out.println("Площадь треугольника со стороной " + base + " и высотой " + height + " равна: " + area);

        // теорема Пифагора: c=корень(a²+b²)
        double length1 = 5.0;
        double length2 = 4.0;
        double hypotenuse = hypotenuse(length1, length2);
        System.out.println("Гипотенуза с катетами " + length1 + " и " + length2 + " равна: " + hypotenuse);
    }//end of main

    // Метод для вычисления третьего угла треугольника
    public static double angle3(double angle1, double angle2) {
        return 180 - (angle1 + angle2); // Сумма углов треугольника всегда 180 градусов
    }
    // Метод для вычисления площади треугольника по стороне и высоте
    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Метод для вычисления гипотенузы по двум катетам (теорема Пифагора)
    public static double hypotenuse(double length1, double length2) {
        return Math.sqrt((length1 * length1) + (length2 * length2));
    }

}//end of class
