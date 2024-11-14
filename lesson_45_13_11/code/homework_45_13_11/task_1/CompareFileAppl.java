package homework_45_13_11.task_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Задание 1. В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main. Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты. Результат должен быть выведен на консоль в виде сообщения.
public class CompareFileAppl {
    public static void main(String[] args) {

        if (args.length < 2){//проверка, что переданы два аргумента для имён файлов
            System.out.println("Два имени файлов в аргументах.");
            return;
        }

        //print file names
        System.out.println("Source file: " + args[0]);
        System.out.println("Destination file: " + args[1]);

        Path fileOne = Paths.get(args[0]);//Path - путь к директории
        Path fileTwo = Paths.get(args[1]);

        try {
            if (Files.notExists(fileOne) || Files.notExists(fileTwo)) {// Проверка существования файлов и их одинаковой длины
                System.out.println("Один или оба файла не существуют.");
                return;
            }

        // Проверка, что размеры файлов совпадают
        try {
            if (Files.size(fileOne) != Files.size(fileTwo)) {
                System.out.println("Файлы разного размера.");
                return;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream file1 = new FileInputStream(fileOne.toFile())) {// Сравнение байтов в обоих файлах
        try (FileInputStream file2 = new FileInputStream(fileTwo.toFile())) {

            int byteFile1, byteFile2;

            while ((byteFile1 = file1.read()) != -1 &&(byteFile2 = file2.read()) != -1){// Чтение байтов из обоих файлов
                if (byteFile1 != byteFile2) {// Если байты не совпадают,
                    System.out.println("Файлы не совпадают.");
                    return;
                }
            }
        }
        }

        System.out.println("Файлы одинаковые.");
        } catch (IOException e) {// исключения
            System.out.println("Error: " + e.getMessage());
        }

    }
}
