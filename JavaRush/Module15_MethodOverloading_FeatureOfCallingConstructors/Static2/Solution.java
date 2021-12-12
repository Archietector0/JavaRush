/*
    1. В статическом блоке считайте две переменные с консоли А и В с типом int.
    2. Не забыть про IOException, который надо обработать в блоке catch.
    3. Закрыть поток ввода методом close().
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Value of A: " + A);
        System.out.println("Value of B: " + B);

    }

    static int A;
    static int B;

    static {
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter int A: ");
            A = Integer.parseInt(buff.readLine());
            System.out.print("Enter int B: ");
            B = Integer.parseInt(buff.readLine());
            buff.close();

        } catch (Throwable e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
