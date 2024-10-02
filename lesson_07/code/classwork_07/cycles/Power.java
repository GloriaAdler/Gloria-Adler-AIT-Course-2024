package classwork_07.cycles;
//Задача 3. Возведите 3 в степень 10, выведите на печать все промежуточные результаты.
public class Power {
    public static void main(String[] args) {

        int pow = (int) Math.pow(3, 10);//casting -преобразование типов, в данном случае double в int
        System.out.println(pow);

        //начальные значения

        int count = 0; //параметр цикла (не обязательно, как пример)
        int res = 1;

        while (count < 10){

            res = res*3;//на этом шаге происходит возведение в степень
            count++; //изменение параметра цикла - ОБЯЗАТЕЛЬНО! нужно в теле цикла значение нарастить ++
            System.out.println(res+ " = 3 in power " + count);

        }
    }
}
