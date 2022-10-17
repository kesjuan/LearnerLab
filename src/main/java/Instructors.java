import java.util.ArrayList;
import java.util.List;

public final class Instructors extends People {

    private static  Instructors INSTANCE =  new Instructors();

    public Instructors() {
        this.personList = new ArrayList<>();
//        instructorsList.add(new Instructor(000,"Ms.Smith"));
//        instructorsList.add(new Instructor(111,"Mr.John"));
//        instructorsList.add(new Instructor(222,"Ms.Louise"));

        personList.add(new Instructor(333,"Ms.Smith"));
        personList.add(new Instructor(111,"Mr.John"));
        personList.add(new Instructor(222,"Ms.Louise"));
    }

    public static Instructors getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new Instructors();
        }

        return INSTANCE;
    }

}
