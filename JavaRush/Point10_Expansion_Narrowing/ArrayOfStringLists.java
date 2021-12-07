import java.io.*;
import java.util.ArrayList;

/**
 * Создать массив, элементами которого будут списки строк.
 * Заполнить массив любыми данными и вывести их на экран.
 */

public class ArrayOfStringLists {
    final private static int size = 2;
    public static void              main( String[] args ) throws IOException {
        ArrayList<Object>   arrayList = new ArrayList<Object>();

        System.out.println();
        for (int y = 0; y < size; ++y) {
            System.out.println("Write to list #" + (y + 1));
            arrayList.add(createListOfString());
            System.out.println();
        }
        for (int i = 0; i < size; ++i) {
            System.out.println(arrayList.get(i));
        }
    }

    public static ArrayList<String> createListOfString () throws IOException {
        BufferedReader      buff = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>   arraySet = new ArrayList<String>();

        for (int i = 0; i < size; ++i) {
            System.out.print("Enter string (" + (i + 1) + "/" + size + "): ");
            arraySet.add(buff.readLine());
        }

        return arraySet;
    }
}