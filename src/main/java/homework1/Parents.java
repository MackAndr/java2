package homework1;

public class Parents extends Grandparents {
    private String name;
    private String surname;
    private int age;
    private String status;

    public String mother(){
        name = "Анна";
        surname = "Иванова";
        age = 54;
        status = "Мать";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, name, surname, age);
    }

    public String father(){
        name = "Олег";
        surname = "Иванов";
        age = 58;
        status = "Отец";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, name, surname, age);
    }
}
