/**
 * Написать два метода: print(int) и print(Integer).
 * Написать такой код в методе main, чтобы вызвались они оба.
 */

public class IntIntegerPrint {
    public static void main(String[] args) {
        print(31);
        print((Integer) 21);
    }

    public static void print ( int num ) {
        System.out.println("int: " + num);
    }

    public static void print ( Integer num ) {
        System.out.println("Integer: " + num);
    }
}