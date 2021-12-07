/**
 * Добавить одну операцию по преобразованию типа, чтобы получался ответ: nine = 9
 * short number = 9;
 * char zero = '0';
 * int nine = (zero + number);
 */

public class Transformation3 {
    public static void main(String[] args) {
        short   number = 9;
        char    zero = '0';
        int     nine = (zero + number);
        char    symbol = (char) nine;
        System.out.println("Res: " + symbol);
    }
}