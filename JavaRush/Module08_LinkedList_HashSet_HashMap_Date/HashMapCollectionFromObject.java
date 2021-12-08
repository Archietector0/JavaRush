import java.io.*;
import java.util.*;

public class HashMapCollectionFromObject {
    final private static int size = 3;
    public static void main(String[] args) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        BufferedReader      buff = new BufferedReader(new InputStreamReader(System.in));
        String              key;
        Object              value;


        System.out.println("\n-----------------------------------");
        System.out.println("-----------TESTING_PROG------------");
        System.out.println("-----------------------------------\n");

        for (int i = 0; i < size; ++i) {
            System.out.print("Enter key: ");
            key = buff.readLine();
            System.out.print("Enter value: ");
            value = new Object();
            map.put(key, value);
        }

        for ( Map.Entry<String, Object> pair : map.entrySet() ) {
            key = pair.getKey();
            value = pair.getValue();
            System.out.println("Result - key: " + key + " value: " + value);
        }







    }
}