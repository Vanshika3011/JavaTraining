import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("laptop");
        list.add("mobile");
        list.add("television");
        list.add("refrigerator");
        list.add("refrigerator");

        list.set(2, "TV");
        Collections.sort(list);

        System.out.println("The sorted list is : " );
//        for(String elect : list){
//
//            System.out.println(elect);
//
//        }

//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

        list.stream().forEach(System.out::println);
        System.out.println("Index of given mobile is"+list.indexOf("mobile"));
        System.out.println("size of given list is"+list.size());

        list.remove(0);
        list.stream().forEach(System.out::println);

    }
}
