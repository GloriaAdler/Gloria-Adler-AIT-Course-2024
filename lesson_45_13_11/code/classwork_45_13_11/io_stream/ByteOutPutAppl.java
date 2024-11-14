package classwork_45_13_11.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutPutAppl {
    public static void main(String[] args) {

        //IO - input, out

        try (FileOutputStream fout = new FileOutputStream("data.txt")) {//в кавычках можно указать имя файла, куда нужно поместить данные. Одна "." точка - это текущий каталог, в моём случае это AIT-TR Java... "data.txt" - корневая директория

            fout.write(65);
            fout.write(66);
            fout.write(67);
            fout.write(10);//код перехода (Enter)
            for (int i = 0; i < 26; i++) {
                fout.write(65+i);//добавляем алфавит, от 65 символа А
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
