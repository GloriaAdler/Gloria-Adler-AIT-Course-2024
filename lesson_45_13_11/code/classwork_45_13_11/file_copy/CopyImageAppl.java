package classwork_45_13_11.file_copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//пишем утилиту для копирования файла
//имена файлов передаются в именах файлов командной строки
public class CopyImageAppl {

    public static void main(String[] args) {
        //String[] - этот массив отвечает за получение этих аргументов
        //проверяем, что аргумента именно 2
        if (args.length != 2){
            System.out.println("Wrong numbers of arguments");
        }
        //print file names
        System.out.println("Source file: " + args[0]);
        System.out.println("Destination file: " + args[1]);

        try (FileInputStream fin = new FileInputStream(args[0])) {
            FileOutputStream fout = new FileOutputStream(args[1]);

            //читать из файла пока != -1, пишем в1й файл
            int a = fin.read();//читаем первый байт
            while (a != -1){//потом уже идем в цикл
                fout.write(a);//здесь пишем файл
                a = fin.read();//здесь читаем файл

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
