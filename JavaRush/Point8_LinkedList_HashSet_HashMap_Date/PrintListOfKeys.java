import java.io.*;
import java.util.*;

public class PrintListOfKeys {
    final private static int size = 2;
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<String, String >();
        BufferedReader      buff = new BufferedReader(new InputStreamReader(System.in));
        String              key, value;

        System.out.println("\n-----------------------------------");
        System.out.println("-----------TESTING_PROG------------");
        System.out.println("-----------------------------------\n");

        for (int i = 0; i < size; ++i) {
            System.out.print("Enter key: ");
            key = buff.readLine();
            System.out.print("Enter value: ");
            value = buff.readLine();
            map.put(key, value);
        }

        System.out.println("\n");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            key = pair.getKey();
            value = pair.getValue();
            System.out.println("Key: " + key);
        }
    }
}