import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class StudentTest {
Student student;

    @BeforeEach
    public void setUpBeforeEach(){
        student = new Student(12345,"Student");
    }

    @Test
    public void implementationTest(){
        //given
        int expected = 1;
        //then
        int actual = student.getClass().getInterfaces().length;
        //when
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void inheritanceTest(){
    //given
    Class expected = Person.class;
    // then
       Class actual = student.getClass().getSuperclass();
    //when
    Assertions.assertEquals(expected,actual);
    }

    @Test
    public void learnTest(){
        //given
        Double expected = 8.0;
        //then
        student.learn(8.0);
        Double actual = student.getTotalStudyTime();
        //when
        Assertions.assertEquals(expected,actual);
    }

}
