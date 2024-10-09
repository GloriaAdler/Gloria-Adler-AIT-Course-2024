package homework_09_10;
//Задание 3. Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main. Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.
public class Task3_09_10 {
    public static void main(String[] args) {

        if (args.length == 0) {
            printAllMinMax();// Если аргументы не указаны, выводим минимальные и максимальные значения для всех перечисленных типов
        }
    }

        // Метод для вывода всех типов, если аргументы не указаны
    private static void printAllMinMax() {
        printMinMaxForType("byte");
        printMinMaxForType("short");
        printMinMaxForType("char");
        printMinMaxForType("int");
        printMinMaxForType("long");
        printMinMaxForType("float");
        printMinMaxForType("double");
    }

        // Метод для вывода минимального и максимального значения по типу
    private static void printMinMaxForType(String type) {
        switch (type) {
            case "byte" -> System.out.println("byte: Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
            case "short" -> System.out.println("short: Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
            case "char" -> System.out.println("char: Min = " + (int) Character.MIN_VALUE + ", Max = " + (int) Character.MAX_VALUE);
            case "int" -> System.out.println("int: Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
            case "long" -> System.out.println("long: Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
            case "float" -> System.out.println("float: Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
            case "double" -> System.out.println("double: Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
            default -> System.out.println("Неверный тип: " + type);
        }
    }
}
