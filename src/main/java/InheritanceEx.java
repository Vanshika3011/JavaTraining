public class InheritanceEx {
    public static void main(String[] args) {
        Babydog bd = new Babydog();
        bd.eat();
        bd.bark();
        bd.wag();
    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}

class Babydog extends Dog{
    void wag(){
        System.out.println("wagging");
    }
}