import java.io.*;
import java.util.*;

public class RemoveNumOver10 {
    final private static int size = 3;
    public static void main(String[] args) throws IOException {
        Set<Integer>    intSet = new HashSet<Integer>();
        BufferedReader  buff = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n-----------------------------------");
        System.out.println("-----------TESTING_PROG------------");
        System.out.println("-----------------------------------\n");

        for (int i = 0; i < size; ++i) {
            System.out.print("Enter num (" + (i + 1) + "/" + size + "): ");
            intSet.add(Integer.parseInt(buff.readLine()));
        }

        Iterator<Integer> iterator = intSet.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element > 10) {
                intSet.remove(element);
            }
        }

        System.out.println("\n-----------------------------------");
        System.out.println("--------------RESULT---------------");
        System.out.println("-----------------------------------\n");

        for ( int bum : intSet ) {
            System.out.println("String: " + bum);
        }





    }
}