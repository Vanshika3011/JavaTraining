class Studentt{
    int id;
    String name;
    int age;

    public Studentt(){}

    public Studentt(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Studentt(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    public void display(){
//        System.out.println(id+ " "+ name+ " "+((age==0)?"":age));
//    }

    @Override
    public String toString() {
        return id + " "+ name +" "+ ((age==0)?" ":age);
    }
}
public class ConstructorOverloadingEx {
    public static void main(String[] args) {
      Studentt stu1 =  new Studentt(1,"Ram");
      Studentt stu2 = new Studentt(2,"Sam", 12);
      Studentt stu3 = new Studentt();
//      stu1.display();
//      stu2.display();

      stu3.id = stu2.id;
      stu3.name = stu2.name;
      stu3.age = stu2.age;
//      stu3.display();

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);

    }
}
