package abstractfactory;

public class UniversityGroupFactory implements GroupFactory {
    @Override
    public Educator getEducator() {
        return new Tutor();
    }

    @Override
    public List<Learner> getLearners() {
        return List.of(new Student());
    }
}