/*
    1. Считать с консоли данные, пока не введено слово "exit".
    2. Для каждого значения вызвать метод print. Если значение:
    2.1. содержит точку '.', то вызвать метод print для Double;
    2.2. больше нуля, но меньше 128, то вызвать метод print для short;
    2.3. больше либо равно 128, то вызвать метод print для Integer;
    2.4. иначе, вызвать метод print для String.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader  buff = new BufferedReader(new InputStreamReader(System.in));
        String          entered;

        while (true) {
            System.out.print("Enter string: ");
            entered = buff.readLine();

            try {
                if (entered.equals("exit")) {
                    System.out.println("NOTE: Program is die.");
                    break;
                } else if (entered.contains(".")) {
                    print(Double.parseDouble(entered));
                } else if (Short.parseShort(entered) > 0 && Short.parseShort(entered) < 128) {
                    print(Short.parseShort(entered));
                } else if (Integer.parseInt(entered) >= 128) {
                    print((Integer) Integer.parseInt(entered));
                }
            } catch (Throwable throwable) {
                print(entered);
            }
        }
    }
    public static void print (double val) {
        System.out.println("Double: " + val);
    }
    public static void print (short val) {
        System.out.println("Short: " + val);
    }
    public static void print (Integer val) {
        System.out.println("Integer: " + val);
    }
    public static void print (String val) {
        System.out.println("String: " + val);
    }
}