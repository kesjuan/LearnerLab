import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    Students students;
    Instructors instructors;

    private ZipCodeWilmington() {
        students = Students.getINSTANCE();
        instructors = Instructors.getINSTANCE();

    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        Learner[] learners = new Learner[students.personList.size()];
        for (int i = 0; i < students.personList.size(); i++) {
            learners[i] = (Learner) students.personList.get(i);
        }

        //Learner[] learners = (Learner[]) students.toArray();

        teacher.lecture(learners,numberOfHours);

    }
    public void hostLecture(long id, double numberOfHours){

        Teacher teacher = (Teacher) instructors.findById(id);
        hostLecture(teacher,numberOfHours);
    }

    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> mapOfStudents = new HashMap<>();

        for (Person x: students.personList){
            Learner y = (Learner) x;
            mapOfStudents.put((Student) x,y.getTotalStudyTime());

        }
        return mapOfStudents;
    }


    public static ZipCodeWilmington getINSTANCE() {
//        if (INSTANCE == null){
//            INSTANCE = new ZipCodeWilmington();
//        }

        return INSTANCE;
    }

}
