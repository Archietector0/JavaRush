/**
 * Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
 * Каждый метод должен возвращать минимальное из двух переданных в него чисел.
 */

public class ThreeMethodsReturnMaxAndMin {
    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 15;

        System.out.println("Result: " + min(a, b));
        System.out.println("Result: " + min((long) a, b));
        System.out.println("Result: " + min((double) a, b));
    }

    public static int min (int a, int b) {
        System.out.println("\nMin int");
        return a < b ? a : b;
    }
    public static long min (long a, long b) {
        System.out.println("\nMin long");
        return a < b ? a : b;
    }
    public static double min (double a, double b) {
        System.out.println("\nMin double");
        return a < b ? a : b;
    }
}