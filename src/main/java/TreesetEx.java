import java.util.*;
public class TreesetEx {
    public static void main(String args[]){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        set.add(4);
        set.add(6);
        set.add(1);
        System.out.println("initial set"+ set);
        System.out.println("head set" + set.headSet(15));
        System.out.println("subset"+ set.subSet(0,5));
        System.out.println("tailset"+ set.tailSet(24));
        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());

        set.clear();
        System.out.println(set);
    }

}
