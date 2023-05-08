package abstractfactory;

import java.util.List

public interface GroupFactory {
    Educator getEducator();

    List<Learner> getLearners();
}