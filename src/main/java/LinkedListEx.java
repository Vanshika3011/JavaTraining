import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> linkl = new LinkedList<>();

        linkl.add(90);
        linkl.add(23);
        linkl.add(45);
        linkl.add(9);
        linkl.add(3);
        linkl.add(5);
        linkl.add(45);

        Collections.sort(linkl);
        linkl.stream().forEach(System.out::println);
        System.out.println("==================");
        Collections.reverse(linkl);
        linkl.stream().forEach(System.out::println);
        System.out.println("==================");
        linkl.remove(3);
        linkl.removeFirstOccurrence(45);
        linkl.stream().forEach(System.out::println);
    }
}
