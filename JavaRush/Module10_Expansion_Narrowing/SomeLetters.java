import java.io.*;
import java.util.*;

/**
 * Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 26 букв алфавита).
 * Вывести результат на экран.
 *
 * Пример вывода:
 * a 5
 * b 8
 * c 3
 * d 7
 * …
 * z 9
 */

public class SomeLetters {
    final private static int size = 26;
    final private static int sizeW = 2;

    public static void                      main ( String[] args ) throws IOException {
        Map<Character, Integer> map;
        map = countSameLet();

        System.out.println();
        for ( Map.Entry<Character, Integer> elem : map.entrySet() ) {
            System.out.println("Letter: " + elem.getKey() + " - " + elem.getValue());
        }
    }

    public static Map<Character, Integer>   createMap () {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char                    sym = 'a';

        for (int i = 0; i < size; ++i) {
            map.put(sym, 0);
            ++sym;
        }

        return map;
    }

    public static ArrayList<String>         writeToArray () throws IOException {
        BufferedReader          buff = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>       arrayList = new ArrayList<String>();

        for (int i = 0; i < sizeW; ++i) {
            System.out.print("Enter string (" + (i + 1) + "/" + sizeW + "): ");
            arrayList.add(buff.readLine());
        }

        return arrayList;
    }

    public static Map<Character, Integer>   countSameLet () throws IOException {
        ArrayList<String>       arrayList;
        Map<Character, Integer> map;
        int                     count = 0;

        map = createMap();
        arrayList = writeToArray();
        for ( Map.Entry<Character, Integer> pair : map.entrySet() ) {
            for (int y = 0; y < arrayList.size(); ++y) {
                for (int x = 0; x < arrayList.get(y).length(); ++x) {
                    if (arrayList.get(y).charAt(x) == pair.getKey() ) {
                        count++;
                        pair.setValue(pair.getValue() + count);
                    }
                    count = 0;
                }
            }
        }

        return map;
    }
}