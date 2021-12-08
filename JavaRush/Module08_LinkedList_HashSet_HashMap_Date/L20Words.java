import java.io.*;
import java.util.*;

public class L20Words {
    final private static int size = 5;
    public static void main(String[] args) throws IOException {
        Set<String>     set = new HashSet<String>();
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n-----------------------------------");
        System.out.println("-----------TESTING_PROG------------");
        System.out.println("-----------------------------------\n");

        for (int i = 0; i < size; ++i) {
            System.out.print("Enter string #" + i + ": ");
            set.add(reader.readLine() + i);
        }

        System.out.println("\n");

        for ( String text : set ) {
            System.out.println(text);
        }
    }
}