import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InstructorTest {
   Instructor instructor;


   @BeforeEach
   public void setUpBeforeEach(){
       instructor = new Instructor(123444,"Teachaa");
   }
    @Test
    public void implementationTest(){
       //given
         String expected = "[interface Teacher]";
         int expectedAmount = 1;
        //then
        String actual = Arrays.toString(instructor.getClass().getInterfaces());
        int actualAmount = instructor.getClass().getInterfaces().length;
        //when
        Assertions.assertEquals(expected,actual);
        Assertions.assertEquals(expectedAmount,actualAmount);
    }
    @Test
    public void inheritanceTest(){
       //given
    Class expected = Person.class;
    //then
     Class actual = instructor.getClass().getSuperclass();
     //when
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void teachTest(){
        //given
        Student student = new Student(123455,"terry");
        Double expected = 8.0;
        //when
        instructor.teach(student,8.0);
        Double actual = student.getTotalStudyTime();

        //then
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void lectureTest(){
       //given
        Student student = new Student(123455,"terry");
        Student student1 = new Student(123456,"serry");
        Student[] students = {student,student1};
        Double expected = 5.0;
        //when


        instructor.lecture(students,10);
        Double actual = student.getTotalStudyTime();
        Double actual2 = student1.getTotalStudyTime();
        //then
        Assertions.assertEquals(expected,actual);
        Assertions.assertEquals(expected,actual2);
    }

}
