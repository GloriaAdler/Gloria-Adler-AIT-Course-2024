package classwork_09_10.application;

public class ArgAppl {
    public static void main(String[] args) {

        //во-первых метод main получает в круглых скобках аргументы
        //public - открытость метода
        //static - характеристика
        //void - метод
        //String[] - это массив данных типа String
        //args - имя массива, неизменна в main

        String str1 = args[0];
        //int n1 = Integer.parseInt(str1);

        String str2 = args[1];
       // int n2 = Integer.parseInt(str2);

       // System.out.println(str1 + "*" + str2 + "=" + n1*n2);
        System.out.println(str1 + ", " + str2);//значение Hello занесли в Edit Configurations (это наверху, где Current File), там нужно вытащить класс и написать необходимые аргументы, которые будут вытягиваться в метод main в String. Аргументы вводятся через пробел, каждый аргумент присваивается по очередно: напр: str1 - это Hello, через пробел str2 - будет alle




    }
}
