import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentsTest {
    @Test
    public void studentsTest() {
        int expected = 4;

        Students students = Students.getINSTANCE();
        ///

        int actual = students.personList.size();
        ////
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void sameStudentTest(){
        Students students = Students.getINSTANCE();
        ArrayList<Person> expectedList = new ArrayList<>();
        expectedList.addAll(students.personList);




        for (Person x: students.personList){
            for (int i = 0; i < expectedList.size(); i++) {
               if (x.getID() == expectedList.get(i).getID()){
                   Assertions.assertSame(expectedList.get(i),x);
               }
            }
        }



    }

}
