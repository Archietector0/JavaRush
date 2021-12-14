/*
    1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
    2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в List lines.
    3. Закрой поток ввода методом close().
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Constants.stringList);
    }
}

class Constants {
    final private static String FILE_NAME = "Hello.txt";
    public static List<String> stringList;

    static {
        String          line;
        File            file = new File(FILE_NAME);
        List<String>    list = new ArrayList<String>();

        try {
            FileReader      fileReader = new FileReader(file);
            BufferedReader  bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();

            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
            stringList = list;
        } catch (Throwable e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}