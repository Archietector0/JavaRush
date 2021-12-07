/**
 * Расставьте правильно операторы приведения типа, чтобы получился ответ: c = 256
 * int a = (byte)44;
 * int b = (byte)300;
 * short c = (byte)(b - a);
 */

public class Transformation4 {
    public static void main(String[] args) {
        int a = (byte)44;
        int b = (short)300;
        short c = (short)(b - a);

        System.out.println("Res: " + c);
    }
}