package ja111.web20.day7;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello from "+name;
    }
}
