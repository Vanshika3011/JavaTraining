import java.util.HashSet;

public class HashsetEx {
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<>();
        set.add("Raina");
        set.add("Shreya");
        set.add("Sita");
        set.add("Ram");
        set.add("Ajit");
        System.out.println(set);

        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
    }
    }
