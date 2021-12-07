import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.SplittableRandom;

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
    }

    public static void main(String[] args){
        ArrayList<Integer> arrayList;
        int                err = 0;

        try {
            arrayList = writeToArray();
            err = safeGetElement(arrayList, 2, -500);
        } catch (MyException e) {
            System.out.println(e.str);
        } catch (Throwable e)
        {
            System.out.println("!!!");
        }
        System.out.println(err);

    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) throws MyException {
        try {
            for (int i = 0; i < list.size(); ++i) {
                if (i == index) {
                    return list.get(index);
                }
            }
            return ((Integer)(Object)new String("HUi"));
        }catch (Throwable e){
            return defaultValue;
        }
    }

    public static ArrayList<Integer> writeToArray () throws IOException, MyException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            for (int i = 0; i < size; ++i) {
                System.out.print("Enter number (" + (i + 1) + "/" + size + "): ");
                arrayList.add(Integer.parseInt(buff.readLine()));
            }
        }catch (Throwable e)
        {
            throw new MyException();
        }

        return arrayList;
    }
}



