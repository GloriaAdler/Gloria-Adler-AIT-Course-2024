package homework_02;

public class Märchen {
        public static void main(String[] args) {

            начало();
            сюжет();
            конец();

        }//end of main

        public static void начало(){
            System.out.println("Испекла бабка колобка, поставила на окно остужать. Стало колобку скучно, решил он по лесу погулять.");
            System.out.println("По пути он встретил зайца, волка, медведя и лису.");
        }

        public static void сюжет (){
            заяц();
            волк();
            медведь();
            лиса();

        }

        public static void конец (){
        System.out.println("Лиса съела колобка.");
    }
        public static void заяц (){
            колобок();
            System.out.println("'Я тебя съем!' - сказал заяц");
            колобок2();
            колобок3();
        }
        public static void волк (){
            колобок();
            System.out.println("'Я тебя съем!' - сказал волк");
            колобок2();
            колобок3();
        }
        public static void медведь (){
            колобок();
        System.out.println("'Я тебя съем!' - сказал медведь");
            колобок2();
            колобок3();
            System.out.println("Лису...");
        }

        public static void лиса (){
            колобок();
            System.out.println("'Что-то я тебя плохо слышу, садь-ка мне на нос...' - говорит ему хитрая лиса.");
            System.out.println("Сел колобок лисе на нос...");
        }

        public static void колобок (){
            System.out.println("'Привет! Я колобок, булка со сметаной. Я от бабушки сбежал.' - сказал колобок.");
        }

        public static void колобок2 (){
            System.out.println("'Ха-ха, не съешь, от тебя я тоже сбегу.' И покатился дальше.");
        }
        public static void колобок3 (){
            System.out.println("Катится он, катится и видит следующего зверя.");
        }



    }//end of class


