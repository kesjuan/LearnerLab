import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PeopleTest {
Person person;
Person person2;
People people;

@BeforeEach
public void setUpBeforeEach(){
    person = new Student(12345,"Jaxel");
    person2 = new Instructor(98765,"Smith");
    people = new People();
    people.personList = new ArrayList<>();
}

    @Test
    public void addTest(){
        //given
        int expected = 1;

        //when
        people.addPerson(person);
       int actual = people.personList.size();
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void removeTest(){
        //given
        int expected = 0;
        people.addPerson(person);
        //when
        people.remove(person);
        int actual = people.personList.size();
        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void findByIdTest(){
    //given
    people.addPerson(person);
    people.addPerson(person2);
        Person expectedPerson = person2;
    //when
        Person actualPerson = people.findById(98765);

    //then
    Assertions.assertSame(expectedPerson,actualPerson);

    }


}
