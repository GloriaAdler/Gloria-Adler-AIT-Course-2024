package classwork_45_13_11.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputAppl {
    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("data.txt")) {

            System.out.println(fin.available());

//читать можно только каким-то одним способом, все сразу не выведут данные для чтения, сработает первый из имеющихся вариантов

//            int x = 0;
//            //Option 1
//            while (x != -1){
//            System.out.println(x);//считались коды латинских букв
//            x = fin.read();
//            }

            //Option 2 можно читать forом
//            int l = fin.available();
//            for (int i = 0; i < l; i++) {
//                int y = fin.read();
//                System.out.println(y);
//            }

            //Option 3 - самый оптимальный вариант
            int l = fin.available();
            byte[] arr = new byte[l];

            fin.read(arr);

            for (byte b : arr) {
                System.out.print(b + " ");
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
