package abstractfactory;

public class Pupil implements Learner {
    @Override
    public void learn() {
        System.out.println("Learning at school");
    }
}