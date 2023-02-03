package homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите статус: ");
        String status = scanner.nextLine();


        Children child = new Children(name, surname, age, status);
        System.out.println(child);
        System.out.println(child.mother());
        System.out.println(child.father());
        System.out.println(child.grandFather());
        System.out.println(child.grandMother());
    }
}