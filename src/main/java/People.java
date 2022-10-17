import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    List<Person> personList;

    public void addPerson(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        Person person = null;
        for (Person x: personList){
            if (x.getID()== id){
                person = x;
            }
        }
       return person;
    }
    public boolean contains(Person person){
        for (Person x: personList){
            if (x == person){
                return true;
            }
        }
        return false;
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void remove(long id){

    personList.remove(findById(id));
    }
    public void removeAll(){
    personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public Person[] toArray(){
        Person[] personArray = new Person[personList.size()];
        for (int i = 0; i < personList.size(); i++) {
            personArray[i] = personList.get(i);
        }
        return  personArray;
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }


}
