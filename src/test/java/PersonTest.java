import org.junit.Assert;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
       public void testConstructor() {
        long expectedId = 12345;
        String expectedName = "Jared";
        Person person = new Person(expectedId, expectedName);

        Long actualID = person.getID();
        String actualName = person.getName();
        Assertions.assertEquals(expectedId, actualID);
        assertEquals(expectedName,actualName);

    }

    @Test
    public void setNameTest(){
        //given
        long expectedId = 12345;
        String firstName = "Jared";
        Person person = new Person(expectedId, firstName);
        String expectedName = "Harry";
        //when

        person.setName(expectedName);
        String actual = person.getName();

        //then
        assertEquals(expectedName,actual);

    }

}