package classwork11_10.user_copyOfLesson21;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class UserTest {

    User user;

    final String email = "peter@mail.de";//ideal email
    final String password = "123456Az!";//ideal password

    @BeforeEach
    void setUp() {
        user = new User(email, password);//create new "fresh" object user
    }

    @Test
    void testValidEmail(){//тест на валидность
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }
    @Test
    void testValidPassword(){
        //user.setPassword(password);
        assertEquals("123456Az!", user.getPassword());
        System.out.println(user.getPassword());
    }

    @Test//когда тест зеленый, значит валидация сработала!!!
    void setEmail() {
        String email = "peter@mail.de";//wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());//надеимся, что Email не изменился
    }

    @Test
    void setEmailWithTwoDots() {
        String email = "peter@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());//с помощью asser мы управляем своими ожиданиями
        System.out.println(user.getEmail());
    }
//*password* разработать методы класса, которые валидируют правильность
//требования к password:
//
//length >= 8
//length of password < 20 - длина пароля
//min one digit - минимум одна цифра
//min one symbol in upperCase - минимум один символ в верхнем регистре
//min one symbol in lowerCase - минимум один символ в нижнем регистре
//min one special symbol (!%@$&) - минимум один специальный символ
    @Test
    void setValidPasswordLength (){
        user.setPassword("123Az!");//7 символов
        assertEquals("123456Az!", user.getPassword());
        user.setPassword("123456789123456789Az!");//21 символ
        assertEquals("123456Az!", user.getPassword());
    }
    @Test
    void setValidPasswordMinOneDigit (){
        user.setPassword("Aaaaaaaz!");//нет цифр
        assertEquals("123456Az!", user.getPassword());
    }
    @Test
    void setValidPasswordMinOneLetterUpperCase (){
        user.setPassword("123456az!");//нет большой буквы
        assertEquals("123456Az!", user.getPassword());
    }
    @Test
    void setValidPasswordMinOneLetterLowerCase (){
        user.setPassword("123456AZ!");//нет маленькой буквы
        assertEquals("123456Az!", user.getPassword());
    }
    @Test
    void setValidPasswordMinOneSpecialSymbol (){
        user.setPassword("123456Azz");//нет специального символа
        assertEquals("123456Az!", user.getPassword());
    }

}