import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class Students extends People{
private static final Students INSTANCE =  new Students();


    private Students() {
 this.personList = new ArrayList<>();


        personList.add( new Student(123,"Jerry"));
        personList.add(new Student(345,"Harry" ));
        personList.add( new Student(678,"Marry"));
        personList.add(new Student(901,"Terry" ));
//        studentList.;
        // addPerson( new Student(123,"Jerry"));

//         student = new Student(123, "Jerry");
//        Student student1 = new Student(345, "Harry");
//        Student student2 = new Student(678, "Marry");
//        Student student3 = new Student(901, "Terry");

    }

    public static Students getINSTANCE() {
//        if (INSTANCE == null){
//            INSTANCE = new Students();
//        }

        return INSTANCE;
    }

}
