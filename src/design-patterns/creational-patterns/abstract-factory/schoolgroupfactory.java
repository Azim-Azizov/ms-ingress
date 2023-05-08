package abstractfactory;

public class SchoolGroupFactory implements GroupFactory {
    @Override
    public Educator getEducator() {
        return new Teacher();
    }

    @Override
    public List<Learner> getLearners() {
        return List.of(new Pupil());
    }
}