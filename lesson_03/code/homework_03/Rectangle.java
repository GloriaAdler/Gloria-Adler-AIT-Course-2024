package homework_03;

//Метод вычисляющий периметр прямоугольника по двум сторонам; Например:
//периметр прямоугольника со сторонами 1000 и 2000 равен ...

public class Rectangle {
    public static void main(String[] args) {

        double a = 1000.0;
        double b = 2000.0;

        // solution of method 1

        double P = 2*(a+b); // P = 2 (a + b), где a и b — длины сторон
        System.out.println("Периметр прямоугольника со сторонами 1000 и 2000 равен " + P);

    }//end of main


}//end of class


