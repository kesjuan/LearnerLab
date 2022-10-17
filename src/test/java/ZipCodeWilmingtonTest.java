import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZipCodeWilmingtonTest {
    @Test
    public void hostLectureTest(){
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getINSTANCE();
        Double expected = 20.0;
        ///
        zipCodeWilmington.hostLecture(333,80);



            for (Student x: zipCodeWilmington.getStudyMap().keySet()){
//                System.out.println(zipCodeWilmington.getStudyMap().get(x));
                Assertions.assertEquals(expected,x.getTotalStudyTime());
            }
            //Assertions.assertEquals(expected,zipCodeWilmington.getStudyMap());


    }
}
