package sumdu.edu.ua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PersonTest {
    Person person;


    @Test
    public void createPersonTest(){

        person.setName("John");
        Assertions.assertEquals("John",person.name);

    }

    @Test
    public void exceptionTest(){
       Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> {new Person("A");});
       Assertions.assertEquals("Less then 3 or more then 20 will cause exception",e.getMessage());
    }

}
