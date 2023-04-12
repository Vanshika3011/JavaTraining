import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDeciEx {
    public static void main(String[] args) {
        BigDecimal num2 = new BigDecimal("987654321.123456789");
        BigDecimal num1 = new BigDecimal("124567890.0987654321");

        System.out.println("Addition"+ num1.add(num2));
        System.out.println("subtraction"+ num1.subtract(num2));

//        System.exit(0);
        num1 = num1.divide(num2, 2, RoundingMode.HALF_UP);
        System.out.println("division"+ num1);
        System.out.println("multiply"+ num1.multiply(num2));
        System.out.println("power"+ num1.pow(2));
        System.out.println("Negation"+ num1.negate());
    }
}
