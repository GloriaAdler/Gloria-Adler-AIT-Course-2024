package classwork_03;
// Вычислить площадь прямоугольника.
// Задайте длину и ширину прямоугольника как переменные типа double.
// Создайте метод, который получает на вход два числа типа double и возвращает тип double площадь прямоугольника.

public class Rectangle {
    public static void main(String[] args) {

        double a = 125.37d; //деление десятичных в Java через точку! d - дабл-числа, можно и не указывать.
        double b = 35.0;

        //первый метод / solution of method 1
        double area = a*b;
        System.out.println("Area of rectangle: " + area); //SOUT - это то, что нам отражает на экран информацию из метода.

        //solution of method 2

        area = areaOfRectangle(a, b);// метод ВСЕГДА имеет круглые скобки()
        System.out.println(area);

    }//end of main

    public static double areaOfRectangle(double a, double b){ // метод возвратный, он нам вернет ответ в первый метод main
        double res = a*b;
        return res;// return служебный метод
    }

}//end of class
