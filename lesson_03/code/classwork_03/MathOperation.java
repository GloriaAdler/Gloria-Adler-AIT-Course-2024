package classwork_03;
//Задать целочисленные переменные x и y, выполнить c ними математические действия, напечатать результаты вместе с текстовыми пояснениями:
// какие переменные участвовали;
//какие действия с ними выполнялись;
//что получилось в результате.


public class MathOperation {
    public static void main(String[] args) {

        int x=38; //значение
        int y=63;

        System.out.println(x+y); //SOUT - это то, что нам отражает на экран информацию из метода.

        int res=x+y;//переменная

        System.out.println("x = "+x+ " складываем с y = " +y+ " получаем " +res);//+ после ковычек!!! это обединитель, а не математический символ. Можно в конце указать x+y или +res (решение).

        res=x-y;//можно не обьявлять второй раз переменную int

        System.out.println("x = " + x + " -y = " + y + " = " + res);

        // деление через / дает целую часть

        res=y/x;

        System.out.println(res);// самый быстрый и простой способ
        System.out.println("y=" +y+ " / x =" +x+ "=" +res);

        // деление через % дает остаток

        res=y%x;
        System.out.println("y=" +y+ " % x =" +x+ "=" +res);

        System.out.println(res);




    }//end of main
}//end of class
