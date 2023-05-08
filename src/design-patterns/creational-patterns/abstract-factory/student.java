package abstractfactory;

public class Student implements Learner {
    @Override
    public void learn() {
        System.out.println("Learning at university");
    }
}