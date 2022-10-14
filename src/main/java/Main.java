import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Student student1 =new Student(123567,"jrtod");
        Instructor instructor = new Instructor(23344,"dsdssd");
       // System.out.println((student1.getClass().getInterfaces().length));
        //System.out.println(student1.getClass().getSuperclass());
        //System.out.println(Arrays.toString(instructor.getClass().getInterfaces()));
        People people =new People();
        people.personList = new ArrayList<>();
        people.personList.add(student1);
        people.personList.add(instructor);
        //System.out.println(people.personList);

      //  System.out.println(people.findById(123567));
        System.out.println(Arrays.toString(people.toArray()));
    }
}
