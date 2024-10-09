package classwork_09_10.wrapper_classes_examples;

import java.math.BigInteger;

public class WrapperClassAppl {
    public static void main(String[] args) {
        int k = 1234567890;//int-только 10 цифр
        System.out.println(k);
        System.out.println("---------------------------------------------------------------------");

        int value1=123;
        Integer a = new Integer(value1);//через конструктор new
        System.out.println(value1);

        System.out.println("---------------------------------------------------------------------");

        Integer integer = Integer.parseInt("1234567890");//Integer (-целое число) - класс в Джава создающий объекты. parseInt - (parse - разобрать) достает строку String, но только интовую, состоящую только из цифр, далее в этой строке можно добавить int число
        System.out.println(integer);
        integer = integer + 5;//перезаписали последнее число с 0 на 5
        System.out.println(integer);

        System.out.println("---------------------------------------------------------------------");

        //автоупаковка
        Integer x = 5;//так выглядит автоупаковка, т.к. Integer сам укаковал 5
        System.out.println(x*10);

        //автораспаковка
        //integer = 7; - можно integer перезаписать с 1234567895 на любое другое число
        int z = x + integer;// x + integer - это 2 наши переменные объявленные выше в Integer - x(5) + integer(1234567895)
        System.out.println(z);

        System.out.println("---------------------------------------------------------------------");

        BigInteger myBigInt = new BigInteger("1234567890123456789012345678901234567890");//заводится только как String, но вмещает в себя огромное кол-во цифр (могу предположить, что любое кол-во цифр без ограничения)
        System.out.println(myBigInt);

        System.out.println("---------------------------------------------------------------------");

        //кол-во цифр в числе
        int b = 1234567890;
        Integer bInt = b;//чтобы перегнать в строку, нужно сначала упаковать int в обёртку Integer, только так можно сменить тип
        //смена типа
        String srt = bInt.toString();
        System.out.println(b);
        int l = srt.length();
        System.out.println("Number" + b + " contains " + l + " digits.");//contains - содержит, digit - цифра

        System.out.println("---------------------------------------------------------------------");

        System.out.println("Max value of int: " + bInt.MAX_VALUE);//MAX_VALUE - константа максимальной длины int. bInt - может быть абсолютно любое значение, лишь было бы intом. Это храниться в памяти ПК
        System.out.println("Min value of int: " + bInt.MIN_VALUE);

        Double d = 0.0;
        System.out.println("Max value of double: " + d.MAX_VALUE);
        System.out.println("Min value of double: " + d.MIN_VALUE);

        System.out.println("---------------------------------------------------------------------");

        //математические вычисления
        int n = 20;
        Integer m = 10;
        m = m + n;
        System.out.println(m);//10+20=30

        n = n + m;//подчеркивание показывает, что произошла автоупаковка
        System.out.println(n);//m - уже 30!, т.к. посчитано выше. 20+30=50

        Double pi = 3.14;
        double circleLenth = 2*pi*10;
        System.out.println(circleLenth);

        System.out.printf("Length of circle: %.2f ", circleLenth);//%.2f - шаблон: %- вызывает шаблон, . - заменит точку, но нужный формат страны нахождения (в нашем случае на запятую); 2f - оставит только 2 знака после запятой (можно поставить 3, 4 и т.д.)
        System.out.println();

        System.out.println("---------------------------------------------------------------------");

        //NaN и Infinite
        double p = 20/0.0;
        if (Double.isNaN(p) || Double.isInfinite(p)){//после точки всегда метод. С большой буквы - это тип! и класс. В скобках, то что мы закладываем в метод. "isInfinite"-бесконечность. "NaN" - не существует.
            System.out.println("Wrong operation, division by Zero");//"Неправильная операция, деление на ноль"
        }else System.out.println(p);

        System.out.println("---------------------------------------------------------------------");

        //перевод String в число
        String str1 = "00000987654321";
        int num = Integer.parseInt(str1);//.parseInt -метод в Джава, который из String сделает int, но только в пределах 10 цифр! отбрасывая первые 0 (любое кол-во первых нулей)
        System.out.println(num);
        String str2 = "00000012345678901234567";
        long num1 = Long.parseLong(str2);//.parseLong -метод в Джава, который из String сделает long, в пределах 19 цифр! Отбросит первые 0, если они есть (любое кол-во первых нулей)
        System.out.println(num1);





    }
}
