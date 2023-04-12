import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<>();

        hmap.put(1,"Ajay");
        hmap.put(2,"Ram");
        hmap.put(3,"MAN");
        System.out.println(hmap);
        int hmapSize = hmap.size();
        System.out.println(hmapSize);
        System.out.println(hmap.entrySet());
        System.out.println(hmap.putIfAbsent(4,"Vansh"));
        System.out.println(hmap.replace(2,"Ram","Payal"));
        System.out.println(hmap.isEmpty());
        System.out.println(hmap.hashCode());
        for(Map.Entry entry : hmap.entrySet()){                 // can use Map.Entry = var
            System.out.println( entry.getKey() + " " + entry.getValue());
        }


        HashMap<Integer,String> hmap1 = new HashMap<>();
        hmap1.put(5,"Hello");
        hmap1.putAll(hmap);
        for(Map.Entry entry : hmap1.entrySet()){                 // can use Map.Entry = var
            System.out.println( entry.getKey() + " " + entry.getValue());
        }
        hmap1.remove(5,"Hello");
        hmap1.remove(3);
        System.out.println(hmap1);
    }
}
