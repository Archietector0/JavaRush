/**
 * Расставьте правильно операторы приведения типа, чтобы получился ответ: d = 3.765
 * int a = 15;
 * int b = 4;
 * float c = a / b;
 * double d = a * 1e-3 + c;
 */

public class Transformation1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / (float) b;
        double d = (double) a * 1e-3 + (double) c;
        System.out.println(d);
    }
}