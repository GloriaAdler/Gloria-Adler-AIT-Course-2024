package homework_08;
//Задача 5. (*) Напечатайте на экране шахматную доску размером 8х8. 0 - белая клеточка, 1 - черная.
          //Левая верхняя клеточка должна быть 0, левая нижняя - 1.
public class Task_05_19_09 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while ( x < 8){
            while (y < 8){
                System.out.print((x + y) % 2 + "|");//print - чтобы написание 8 знаков было посточным
                y++;
            }//end of whileY
            System.out.println();//для перехода на новую строку
            y = 0;
            x++;
        }//end of whileX
    }//end of main
}//end of clacc
