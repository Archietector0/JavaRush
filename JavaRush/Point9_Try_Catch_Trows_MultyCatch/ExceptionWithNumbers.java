public class ExceptionWithNumbers {
    public static void main(String[] args) {
        int res;

        try {
            System.out.println("Before run methodDivide()");
            res = methodDivide();
            System.out.println("Result of method: " + res);
            System.out.println("After method methodDivide()");
        } catch (ArithmeticException e) {
            String s = e.getMessage();
            System.out.println("Result: " + s);
        }
    }
    public static int methodDivide () {
        int a, b, c;

        a = 42;
        b = 0;
        c = a / b;

        return c;
    }
}