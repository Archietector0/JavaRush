import java.io.*;
import java.util.*;

public class HashMapFromTenPairs {
    final private static int size = 10;
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        BufferedReader      buff = new BufferedReader(new InputStreamReader(System.in));
        String              key, value;

        for (int i = 0; i < size; ++i) {
            System.out.print("Enter key: #" + (i + 1) + ": ");
            key = buff.readLine();
            System.out.print("Enter value: #" + (i + 1) + ": ");
            value = buff.readLine();
            map.put(key, value);
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            key = pair.getKey();
            value = pair.getValue();
            System.out.println("Pair \"key : value - " + key + " : " + value + " \"");
        }



    }

}