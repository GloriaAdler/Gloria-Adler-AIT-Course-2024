package classwork_03;

//Вычислить длину окружности по ее радиусу.
//Задайте радиус окружности как переменную типа double.
//Реализуйте метод, который вернет тип double и вычислит длину окружности по ее радиусу.

public class Circle {
    public static void main(String[] args) {//метод main запускает программу. Этот метод за класс используется только один раз. Остальные методы пишем в классе под методом main.

        double PI = 3.14159; // константа числа пи записана в ручную, поэтому при ответе результат обрезан до тысячных (628.318)
        double r=100; // в памяти нужно указать какое то числовое значение

        double lengthOfCircle = 2 * PI * r;
        System.out.println(lengthOfCircle); // простой способ. SOUT - это то, что нам отражает на экран информацию из метода.

        //solution with method

        double l = lengthOfCircleMethod(r);
        System.out.println("Length of circle with radius " + r + " = " +l);

    }//end of main

    private static double lengthOfCircleMethod(double r) {//double первое - это медод,  double второе - значение которое вернется

        return 2 * Math.PI*r; //PI в этом случае вызваная константа, поэтому после "." число пи более расширено в ответе (628.318530...).

    }
}//end of class
