
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> initialList = new ArrayList<>();
        initialList.add("ноутбук");
        initialList.add("мышка");
        initialList.add("ноутбук");
        initialList.add("сокет");
        initialList.add("сокет");

        System.out.println("\nИзначальный список: " + initialList);

        Set<String> set = new LinkedHashSet<>(initialList);
        System.out.println("\nУникальный список: " + set);
    }
}