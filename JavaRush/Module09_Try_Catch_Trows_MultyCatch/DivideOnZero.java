import java.util.Arrays;

public class DivideOnZero {
    public static void main(String[] args) {
        try {
            divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("StackTrace: " + Arrays.toString(e.getStackTrace()));
        }
    }

    public static void divisionByZero () {
        int a, b, c;
        a = 42;
        b = 0;
        c = a / b;
    }
}