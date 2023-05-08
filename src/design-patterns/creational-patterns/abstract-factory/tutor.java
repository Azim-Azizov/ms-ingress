package abstractfactory;

public class Tutor implements Educator {
    @Override
    public void educate() {
        System.out.println("Educating at university");
    }
}