package classwork_14_10.compare_string;
//равенство строк - как понять?
public class CompareStringAppl {
    public static void main(String[] args) {

        int x = 5;//хранятся в стеке, т.к. примитивные данные
        int y = 5;//хранятся в стеке, т.к. примитивные данные

        boolean checker = (x==y);
        System.out.println(checker);//true

        System.out.println("-----------------------------------------------------------------");

        String str1 = "Europe";//это объект ссылочного типа: str1 - лежит в стеке => дальше идет ссылка на Europe - лежит уже в хипе
        String str2 = "Europe";//str2 - лежит в стеке => дальше идет ссылка на Europe - лежит уже в heap

        checker = (str1 == str2);//будет результат сравнение строк str1 и str2
        System.out.println(checker);

        System.out.println("-----------------------------------------------------------------");

        String str3 = new String("Europe");//здесь мы создали третий новый объект
        checker = (str1 == str3);
        System.out.println(checker);//false, так как new создает новую ссылку, которая отличается от ссылок от str1 и str2 (несмотря на то что равны объекты после ссылок равны)

        System.out.println("-----------------------------------------------------------------");

        //есть типы с объектами и есть методы, благодаря которым мы можем корректировать всё то что делается типами

        checker = str1.equals(str3);//camper String with method equals, equals - игнорирует ссылки и сравнивает только значения
        System.out.println(checker);//true

    }
}
