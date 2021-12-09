/**
 *  Написать пять методов print с разными параметрами.
 */

public class FiveDifferentPrint {
    public static void main(String[] args) {
        print(54);
        print("Jupiter");
        print('c');
        print((byte) 3);
        print((short) 7);
    }

    public static void print ( int num ) {
        System.out.println("It's int: " + num);
    }
    public static void print ( String str ) {
        System.out.println("It's string: " + str);
    }
    public static void print ( char c ) {
        System.out.println("It's char: " + c);
    }
    public static void print ( byte b ) {
        System.out.println("It's byte: " + b);
    }
    public static void print ( short sh ) {
        System.out.println("It's short: " + sh);
    }
}