/*
    * Считать с консоли URl ссылку.
    Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
    URL содержит минимум 1 параметр.
    Если присутствует параметр obj, то передать его значение в нужный метод alert.
    alert(double value) - для чисел (дробные числа разделяются точкой)
    alert(String value) - для строк

    Пример ввода:
    http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
    Пример вывода:
    lvl view name

    Еще пример ввода:
    http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
    Пример вывода:
    obj name
    double 3.14
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main (String[] args) throws IOException {
        BufferedReader      buff = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<String, String>();
        String              URL, str = "";
        int                 i = 0, flag = 0;

        System.out.print("Enter URL: ");
        URL = buff.readLine() + '\0';
        while (i < URL.length()) {
            if (URL.charAt(i) == '?'){
                ++i;
                flag = 1;
            }
            if (flag == 1 && URL.charAt(i) != '&')
                str += "" + URL.charAt(i);
            if (flag == 1 && URL.charAt(i) == '&' || URL.charAt(i) == '\0') {
                createDict(map, str);
                str = "";
            }
            ++i;
        }
        printResult(map);
        System.out.println();
    }

    public static void printResult (Map<String, String> map) {
        for ( Map.Entry<String, String> pair : map.entrySet() ) {
            if (pair.getKey().equals("obj"))
                alert(Double.parseDouble(pair.getValue()));
            alert(pair.getKey());
        }
    }

    public static void createDict (Map<String, String> map, String str) {
        if (!str.contains("="))
            map.put(str, "None");
        else
            for (int f = 0; f < str.length(); ++f)
                if (str.charAt(f) == '=')
                    map.put(str.substring(0, f), str.substring(f + 1, str.length()));
    }

    public static void alert (String value) {
        System.out.print(value + " ");
    }

    public static void alert (double value) {
        System.out.println("double " + value);
    }
}