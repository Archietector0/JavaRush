import java.io.*;
import java.util.*;

public class CatsHashMapCollection {
    final private static int size = 2;
    public static void main(String[] args) throws IOException {
        Map<String, Cat>    map = new HashMap<String, Cat>();
        BufferedReader      buff = new BufferedReader(new InputStreamReader(System.in));
        String              key;
        Cat                 value;
//        Cat                 cat = new Cat();

        for (int i = 0; i < size; ++ i) {
            System.out.print("Enter Cat's name (key) #" + (i + 1) + ": ");
            value = new Cat(buff.readLine());
            key = value.getName();
            map.put(key, value);
        }

        System.out.println("\n\n");

        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Cat> pair = iterator.next();
            key = pair.getKey();
            value = pair.getValue();
            System.out.println("Result: " + key + " : " + value);
        }

    }
}

class Cat {
    // Vars
    private String name;

    // Constructor
    public Cat ( String name ) {
        this.name = name;
    }

    public Cat () {}

    // Getter/Setter - methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}