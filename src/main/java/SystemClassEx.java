import java.util.Properties;

public class SystemClassEx {
    public static void main(String[] args) {

        System.out.println("This is system class example");

        System.out.println("Your system properties");
        Properties prop = System.getProperties();

        System.out.println(prop.getProperty("user.name"));
        System.out.println(prop.getProperty("user.dir"));
        System.out.println(prop.getProperty("user.home"));
        System.out.println();
        String c="Shubham"+System.lineSeparator()+"Jadon";
        System.out.println(c);
        System.out.println();
        System.out.println("Current time in millisecond" + System.currentTimeMillis());
        System.out.println("Time in nano seconds" + System.nanoTime());
        System.out.println();
        System.out.println();
        String a="Shubham";
        System.out.println("identity hash code of object a = "+System.identityHashCode(a));
        String b="Jadon";
        System.out.println("identity hash code of object b = "+System.identityHashCode(b));
    }

}
