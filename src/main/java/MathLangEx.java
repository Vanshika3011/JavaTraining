public class MathLangEx {
    public static void main(String[] args) {

        int x = 123;
        int z = 453;
        float y = 45.876f;
        double a = 25.6 ;
        double b = 0;
        double c = -9.4;
        double p = Math.random();
        int q = (int) Math.random();


        System.out.println("Max : "+ Math.max(x,z));
        System.out.println("Min : "+ Math.min(x,z));
        System.out.println("Absolute : "+ Math.abs(y));
        System.out.println("Ceiling : "+ Math.ceil(a));
        System.out.println("Floor : "+ Math.floor(a));
        System.out.println("Square root of a : " + Math.sqrt(a));
        System.out.println("Square root of b : " + Math.sqrt(b));
        System.out.println("Square root of c : " + Math.sqrt(c));
        System.out.println("Round off to : "+ Math.round(y));
        System.out.println("Random double : "+ p);
        System.out.println("Random double : "+ q);
    }
}
