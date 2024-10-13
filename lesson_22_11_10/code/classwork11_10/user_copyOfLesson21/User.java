package classwork11_10.user_copyOfLesson21;

public class User {

    private String email;
    private String password;

    //constructor
    public User(String email, String password) {//создали объект User, мы видим, что это конструктор, т.к. его имя совпадает с именем класса!
        setEmail(email);//убираем this... и тянем метод setEmail
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){//валидация
            this.email = email;
        }else {
            System.out.println(email + "is NOT valid.");
        }
    }


    private boolean isEmailValid(String email) {
        //Эту часть Леонид скинул в чат, что это такое, будет завтра
        int indexAt = email.indexOf('@'); // index where @ placed

        if(indexAt == -1 || indexAt != email.lastIndexOf('@')){
            return false;
        }
        if(email.indexOf('.', indexAt) == -1){//это значит, что должна быть хотя бы одна точка, а -1 значит, что если хотя бы одна точка отсутствует, то емайл не верный, тест должен упасть
            return false;
        }
        if(email.lastIndexOf('.') >= email.length() - 2) {//это значит, что после точки должно идти минимально 2 символа, т.к.  доменов из одного символа не существует (.de; .com usw.)
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false; // ± / |\
            }
        }
        return true;

    }

//password разработать методы класса, которые валидируют правильность
//требования к password:
//
//length >= 8
//min one digit - минимум одна цифра
//min one symbol in upperCase - минимум один символ в верхнем регистре
//min one symbol in lowerCase - минимум один символ в нижнем регистре
//min one special symbol (!%@$&) - минимум один специальный символ
//length of password < 20 - длина пароля
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (isPasswordValid(password)){
            this.password = password; //this.password- пользовательский пароль, password - валидный пароль
        }else {
            System.out.println(password + "is not valid");
        }
        //this.password = password;
    }

    private boolean isPasswordValid(String password) {
        boolean[] res = new boolean[5]; // [5] - так как тестоа на пароль пять

        if (password.length()>= 8 && password.length()<20){//&& - И то И другое
            res [0] = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);//charAt - перебираем каждый символ и ищем хотябы 1 цивру
            if (Character.isDigit(ch)){
                res [1] = true;
            }
            if (Character.isUpperCase(ch)){//Character.isUpperCase - ищем хотя бы 1 большую букву
                res[2] = true;
            }
            if (Character.isLowerCase(ch)){//Character.isLowerCase - ищем хотя бы 1 маленькую букву
                res[3] = true;
            }
            if ("!%@$&".indexOf(ch)>=0){//ищем !%@$& с помощью .indexOf(ch)
                res[4] = true;
            }
            if (res[0] && res[1] && res[2] && res[3] && res[4]){
                return true;
            }
        }
//если из перечисленных выше if что-то случилось, то мы получим true, если нет то return ниже будет false
        return false;//как заглушку метода boolean ставят заглушку по умолчанию return false (чтобы не было красноты)
    }
}
