public class Person {
    private final long ID;

    private String name;

    public Person(long ID, String name) {
        this.ID = ID;
        this.name = name;
    }
//    public Person getPerson(){
//        return
//    }




    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
