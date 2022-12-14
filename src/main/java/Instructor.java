public class Instructor extends Person implements Teacher {


    public Instructor(long ID, String name) {
        super(ID, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (int i = 0; i < learners.length; i++) {
            learners[i].learn(numberOfHoursPerLearner);

        }
    }

}
