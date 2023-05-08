package abstractfactory.test;

import abstractfactory;

public class Test {
    public static void main(String[] args) {
        var groupFactory = new UniversityGroupFactory();
        var tutor = groupFactory.getEducator();
        List<Learner> learners = groupFactory.getLearners();
        tutor.educate();
    }
}