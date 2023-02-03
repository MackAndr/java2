package homework1;

public class Grandparents {
    private String name;
    private String surname;
    private int age;
    private String status;

    public String grandMother(){
        name = "Просковья";
        surname = "Петрова";
        age = 80;
        status = "Бабушка";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, name, surname, age);
    }
    public String grandFather(){
        name = "Максим";
        surname = "Иванов";
        age = 81;
        status = "Дед";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, name, surname, age);
    }
}
