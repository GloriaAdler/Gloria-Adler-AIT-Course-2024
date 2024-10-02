package classwork_05;
//Проверка положительное или отрицательное число.
//Проверка четное или нечетное целое число.
//Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
//прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".

public class ConditionEx {
    public static void main(String[] args) {
//не полный условный оператор
int x = 158;
if (x>=0){
    System.out.println("x = " +x+ " is positive number");
}
if (x<0) {
    System.out.println("x = " + x + " is negative number");
}

//полный условный оператор
        x= -234; //значение переменной - х, переизменено, но переменая остается всё таки х из if выше.
if (x>=0) {
     System.out.println("x = " +x+ " is positive number");
} else {
      System.out.println("x = " + x + " is negative number");
}
x =112;
if (x % 2 == 0){  // % - остаток от деления; == равно, в четный остаток должен делиться на 2 (если 3 раздетить на 2, остаток будет 1, т.е. не равно 2)
    System.out.println("x=" +x+ " is even"); //even - четное

}else {
    System.out.println("x=" +x+ " is odd"); //odd - нечетное
}

int age = 15;
if (age>=18){
    System.out.println("Вам разрешено действовать самостоятельно.");
} else {
    System.out.println("Вам надо прийти вместе с вашим опекуном.");

}

    }//end of main

}//end of class
