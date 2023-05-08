package abstractfactory;

public class Teacher implements Educator {
    @Override
    public void educate() {
        System.out.println("Educating at school");
    }
}