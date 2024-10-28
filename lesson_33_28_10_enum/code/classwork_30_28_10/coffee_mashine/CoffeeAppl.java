package classwork_30_28_10.coffee_mashine;

import java.util.Scanner;

public class CoffeeAppl {
    public static void main(String[] args) {

        System.out.println("Welcome to Coffee Shop!");
        boolean flag = true;
        Coffee [] coffees = Coffee.values();

        Scanner scanner = new Scanner(System.in);

        //start of loop
        while (flag){//бесконечность цикла, цикл кончится, когда будет введено 5

        System.out.println("Imput your choice");
        System.out.println("Press 1 for Espresso, 2 for Americano, 3 for Cappuccino, 4 for Latte");
        int choice = scanner.nextInt();

            switch (choice){
                case 1, 2, 3, 4 -> {System.out.println("Your choice is: " + coffees[choice - 1].getTitle());//-1 - чтобы номер элемента сделать такиж же как индекс (ESP [0] первый элемент 1 - 1 = 0); можно сделать одним кейсом, т.к. все одинаковое
                System.out.println("Please, make payment: " + coffees[choice-1].getPrice());
                }
                //второй способ - кейсы отдельно
//                case 2 -> {System.out.println("Your choice is: " + coffees[choice-1].getTitle());
//                System.out.println("Please, make payment: " + coffees[choice-1].getPrice());
//                }
//                case 3 -> {System.out.println("Your choice is: " + coffees[choice-1].getTitle());
//                System.out.println("Please, make payment: " + coffees[choice-1].getPrice());
//                }
//                case 4 -> {System.out.println("Your choice is: " + coffees[choice-1].getTitle());
//                System.out.println("Please, make payment: " + coffees[choice-1].getPrice());
//                }
                case 5 -> flag = false;
                default -> System.out.println("Wrong choice");
            }

        }
    }

}
