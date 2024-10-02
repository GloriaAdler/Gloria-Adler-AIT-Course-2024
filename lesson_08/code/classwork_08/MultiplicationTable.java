package classwork_08;
//Задание 2. Распечатать в консоли таблицу умножения от 1 до 10.
public class MultiplicationTable {
    public static void main(String[] args) {

        //икл в цикле
        int i = 1, j = 1; // можно и так указать через запятую и с одним int


        while (i < 11) {
            while (j < 10) {

                System.out.print(i + " x " + j + " = " + (i * j) + " | ");//для печати посточно убираем ln
                j++;

            }//end of while j
            j = 1;
            i++;
            System.out.println();// пустой sout println -мы просто уходим на на вовую строку

        }//end of while i

    }
}
