package homework2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("good key", "value");

        // Инициализация нашего "иммутабельного" класса
        AlmostMutableClass almostMutable = new AlmostMutableClass("this is not immutable", map);
        MutableClass mutableClass = new MutableClass("this is immutable", map);

        // Мы не можем изменять состояние объекта через добавление элементов в полученную map
        System.out.println("Результат в неизменяемом классе после получения map");
        almostMutable.getFieldMap().put("bad key", "another value");
        almostMutable.getFieldMap().keySet().forEach(e -> System.out.println(e));

        System.out.println("Результат в изменяемом классе после получения map");
        mutableClass.getFieldMap().put("bad key", "another value");
        mutableClass.getFieldMap().keySet().forEach(e -> System.out.println(e));

        System.out.println("");
        System.out.println("Результат после изменения исходного map в неизменяемом классе");
        map.put("another key", "another value");
        almostMutable.getFieldMap().keySet().forEach(e -> System.out.println(e));
        System.out.println("Результат после изменения исходного map в изменяемом классе");
        mutableClass.getFieldMap().keySet().forEach(e -> System.out.println(e));
    }

}
