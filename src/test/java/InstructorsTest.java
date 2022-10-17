import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class InstructorsTest {
    @Test
    public void InstructorsTest(){
        Instructors instructors = Instructors.getINSTANCE();
        int expected = 3;
        ///
        int actual = instructors.personList.size();
        ///

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void sameInstructorTest(){
        Instructors instructors = Instructors.getINSTANCE();
        ArrayList<Person> expectedList = new ArrayList<>();
        expectedList.addAll(instructors.personList);


        for (Person x: instructors.personList){
            for (int i = 0; i < expectedList.size(); i++) {
                if (x.getID() == expectedList.get(i).getID()){
                    Assertions.assertSame(expectedList.get(i),x);
                }
            }
        }



    }
}
