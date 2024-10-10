package classwork_10_10.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    final String email = "peter@mail.de";//ideal email
    final String password = "123456Az!";//ideal password

    @BeforeEach
    void setUp() {
        user = new User(email, password);//create new "fresh" object user
    }

    @Test
    void testValidEmail(){

        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());

    }

    @Test
    void setEmail() {
        String email = "peter@@|de";//wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());//надеимся, что Email не изменился

    }

    @Test
    void setPassword() {


    }
}