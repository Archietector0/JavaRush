import java.io.*;
import java.util.*;

public class HashSetFromPlants {
    final private static int size = 10;
    public static void main(String[] args) throws IOException {
        Set<String>     set = new HashSet<String>();
        BufferedReader  buff = new BufferedReader(new InputStreamReader(System.in));
        String          text;

        for (int i = 0; i < size; ++i) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            set.add(buff.readLine());
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            text = iterator.next();
            System.out.println("String: " + text);
        }

    }
}