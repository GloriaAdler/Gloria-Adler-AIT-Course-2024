package classwork_07.cycles;
//Задача 1. Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки берутся из корзины до тех пор, пока они там есть.
// Последнее сообщение: "Яблоки кончились!".
public class Apples {
    public static void main(String[] args) {

        int apples = 30; // начальные данные
        int count = 0; // Параметр цикла. Цикл всегда целое число, т.к. циклу нужен конец, count - почти всегда 0
        int startApples = 30;

        while (count< startApples) {// в () пишем условия, startApples можно указать из условия, а можно числом 30, что также будет верно
            System.out.println("Take one apple from the basket.");
            apples = apples - 1; // перепресвоение переменной apples
            //дальше ОБЯЗАТЕЛЬНО нужно поменять переменную, иначе цикл не завершиться
            count= count + 1;
            System.out.println("Now we have only: " + apples + " in the basket");
        }//end of while
        System.out.println("The job is done!" + count + " apples added in the pie");

    }//end of main
}//end of class
