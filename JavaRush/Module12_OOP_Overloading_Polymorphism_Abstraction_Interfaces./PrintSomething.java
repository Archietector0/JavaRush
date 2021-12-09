/**
 * Написать два метода: print(int) и print(String).
 */

public class PrintSomething {
    public static void main(String[] args) {
        print( 42 );
        print( "Mars" );
    }

    public static void print ( int num ) {
        System.out.println(num);
    }

    public static void print ( String str ) {
        System.out.println(str);
    }
}