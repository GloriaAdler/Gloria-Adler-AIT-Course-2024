package methods;

public class Circus {
    public static void main(String[] args) {

        ligthOn();
        entertainer();
        ligtsOff();

    }//end of main

    public static void ligthOn(){
        System.out.println("Ligths ONNNN!!!"); //SOUT - это то, что нам отражает на экран информацию из метода.
    }
    public static void ligtsOff (){
        System.out.println("Ligth OFF...");
    }
    public static void entertainer (){
        jogger();
        cloun();
        singer();
    }
   public static void jogger (){
       System.out.println("I´m jogging...");
   }
   public static void cloun (){
       System.out.println("I`m jocking...");
   }
   public static void singer (){
       System.out.println("I`m singing");
   }

}//end of class
