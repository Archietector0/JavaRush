import java.io.*;
import java.util.ArrayList;

public class MethodTryCatch {
    final private static int size = 10;
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.println("\n-------------------------------");
        System.out.println("-----------START_PROG----------");
        System.out.println("-------------------------------\n");

        array = readData();
    }

    public static ArrayList<Integer> readData () throws IOException {
        ArrayList<Integer>  array = new ArrayList<Integer>();
        BufferedReader      buff = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (int i = 0; i < size; ++i) {
                System.out.print("Enter number: ");
                array.add(Integer.parseInt(buff.readLine()));
            }
        } catch (NumberFormatException e) {
            System.out.println("\nERROR: invalid format argument.");
            System.out.println("\nData into array:");

            for ( int num : array) {
                System.out.println(" [" + num + "]");
            }
            System.out.println("Size of array: " + array.size());
        }
        return array;
    }
}
