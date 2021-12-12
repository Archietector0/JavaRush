/*
    Задача: Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.
    Пример: 4! = factorial(4) = 1*2*3*4 = 24
    1. Ввести с консоли число меньше либо равно 150.
    2. Реализовать функцию factorial.
    3. Если введенное число меньше 0, то вывести 0.
    0! = 1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int             num;
        BufferedReader  buff = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number: ");
        num = Integer.parseInt(buff.readLine());
        if (num > 150)
            System.out.println("\nNOTE: Number must be less than 150,\nProgram is die.");
        else
            System.out.println("Result: " + factorial(num));
    }

    public static int factorial (int num) {
        int buff = 1;

        if (num < 0)
            return 0;

        for (int i = 1; i <= num; ++i) {
            buff *= i;
        }
        return buff;
    }
}