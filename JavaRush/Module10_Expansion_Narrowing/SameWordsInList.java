import java.io.*;
import java.util.*;

/**
 * Ввести с клавиатуры в список 20 слов.
 * Нужно подсчитать количество одинаковых слов в списке.
 * Результат нужно представить в виде словаря Map<String, Integer>,
 * где первый параметр – уникальная строка, а второй – число,
 * сколько раз данная строка встречалась в списке. Вывести содержимое словаря на экран.
 *
 * В тестах регистр (большая/маленькая буква) не влияет на результат.
 */

public class SameWordsInList {
    final private static int size = 5;
    public static void                  main ( String[] args ) throws IOException {
        ArrayList<String>       strArr;
        Map<String, Integer>    map;

        strArr = initArray();
        map = findSameWords(strArr);
        printMap(map);
    }

    public static ArrayList<String>     initArray () throws IOException {
        BufferedReader          buff = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>       strArr = new ArrayList<String>();

        System.out.println();
        for (int i = 0; i < size; ++i) {
            System.out.print("Enter string (" + (i + 1) + "/" + size + "): ");
            strArr.add(buff.readLine().toLowerCase());
        }

        return strArr;
    }

    public static Map<String, Integer>  findSameWords ( ArrayList<String> strArr ) {
        Map<String, Integer>    map = new HashMap<String, Integer>();
        int                     count = 0;

        for ( String elemY : strArr ) {
            for ( String elemX : strArr ) {
                if (elemY.equals(elemX)) {
                    count++;
                }
            }
            map.put(elemY, count);
            count = 0;
        }

        return map;
    }

    public static void                  printMap ( Map<String, Integer> map ) {
        System.out.println();
        for ( Map.Entry<String, Integer> pair : map.entrySet() ) {
            System.out.println("(Map) [key : value] | [" + pair.getKey() + " : " + pair.getValue() + "]");
        }
    }
}