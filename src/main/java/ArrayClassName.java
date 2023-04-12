public class ArrayClassName {
    public static void main(String args[]){
//declaration and initialization of array
        String arr[]={"who","what","where"};
//getting the class name of Java array
        Class c=arr.getClass();

        String name=c.getName();
//printing the class name of Java array
        System.out.println(name);

    }
}
