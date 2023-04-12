import java.util.*;

class Student{
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}

class AgeComparator implements Comparator<Object>{
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if(s1.age == s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
public class TestComparator {
    public static void main(String args[]){

        ArrayList myList = new ArrayList();
        myList.add(new Student(101, "vansh", 25));
        myList.add(new  Student(106,"yashvi",23));
        myList.add(new Student(105, "ved", 27));

        Collections.sort(myList, new AgeComparator());
        System.out.println("Sorted list is as below");

        Iterator iter = myList.iterator();
        while(iter.hasNext()) {
            Student st = (Student) iter.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        }



    }

