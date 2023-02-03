package homework1;

public class Children extends Parents{
    private String name;
    private String surname;
    private int age;
    private String status;
    public Children(String name, String surname, int age, String status) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.status = status;

    }
    @Override
    public String toString() {
        return "Ребенок: " + name + ", " + surname + ", " + age + ", " + status;
    }
}
