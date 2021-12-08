import java.io.*;
import java.util.ArrayList;

/**
 * Создать список целых чисел.
 * Ввести с клавиатуры 20 целых чисел.
 * Создать метод по безопасному извлечению чисел из списка:
 * int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
 *
 * Метод должен возвращать элемент списка (list) по его индексу (index).
 * Если в процессе получения элемента возникло исключение,
 * его нужно перехватить, и метод должен вернуть defaultValue.
 */

public class SafeExtractFromList {
    final private static int size = 3;

    static class MyException extends java.lang.RuntimeException {
        String str = new String("ERROR: Invalid NumberFormat !");
        int val = 0;

        public MyException ( int defVal ) {
            this.val = defVal;
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList;
        int                err = 0;

        arrayList = writeToArray();
        try {
            err = safeGetElement(arrayList, 12, -500);
        } catch (MyException e) {
            System.out.println("ERROR: " + e.val);
        }

        System.out.println(err);

    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) throws MyException {
        if (index >= list.size() || index < 0) {
            throw new MyException(defaultValue);
        }

        for (int i = 0; i < list.size(); ++i) {
            if (i == index) {
                return list.get(index);
            }
        }
        return defaultValue;
    }

    public static ArrayList<Integer> writeToArray () throws IOException, MyException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int i = 0; i < size; ++i) {
                System.out.print("Enter number (" + (i + 1) + "/" + size + "): ");
                arrayList.add(Integer.parseInt(buff.readLine()));
            }
        return arrayList;
    }
}



