package classwork_16_10.regex_appl;

public class RegexAppl {
    public static void main(String[] args) {

        String text = " java";
        String pattern = " *(J|j)ava([1-9]|[1-9][0-9])?";//это набор требований, которые может содержать строка, которую мы ожидаем увидеть. * - 0 или больше; (J|j) - большая или маленькая [1-9] - однозначное число в указанном диапазоне; | - ИЛИ; [1-9][0-9] - двузначное число в указанном диапазоне; если нужно другое кол-во [...], то указываем сколько нужно : [0-9][0-9][0-9][0-9] - 1111; ? - можно ставить цифры или не ставить, если ? не поставить, то нужно четко проставлять все цифры указанные в интервалах [...]

        boolean checker = text.matches(pattern);//matche - совпадение
        System.out.println(checker);

        System.out.println("---------------------------------");


        // domain
        String domain = "A-b-r.a-kadabra.il";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)\\.(com|org|de|il)";
        checker = domain.matches(pattern);
        System.out.println(checker);

        System.out.println("----------------------------------------");

        //e-mail
//        1) @ exists and only one (done)
//        2) dot after @ (done)
//        3) after last dot 2 or more symbols (done)
//        4) alphabetic, digits, '_', '-', '.', '@' (done)

        String email = "peter@mail.com";
        pattern = "((\\w(-|\\.|\\w)*\\w)|\\w)@[a-zA-Z0-9](\\w|-|\\.)*\\.[A-Za-z]{2,6}";
        checker = email.matches(pattern);
        System.out.println(checker);



    }
}
