package classwork_05;
// Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.

public class Division {

    public static void main(String[] args) { //метод должен отвечать на вопрос делится ли наше число или нет.
       int a = 45;
       int b = 6;

       boolean res = isDivided(a, b);
       System.out.println("a=" +a+ " ,b =" +b+ " is divided " +res);

    }
    public static boolean isDivided(int a, int b){ // метод boolean вернет либо ложь, либо фальшь
        return  a % b == 0;
    }

}
