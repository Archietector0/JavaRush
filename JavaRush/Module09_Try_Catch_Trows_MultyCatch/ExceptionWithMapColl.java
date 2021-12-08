import java.util.HashMap;

public class ExceptionWithMapColl {
    public static void main(String[] args) {
        try {
            System.out.println("Step 1");
            createMap();
            System.out.println("Step 2");
        } catch (Exception e) {
            System.out.println("Result: " + e.getMessage());
        }

    }

    public static void createMap () {
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
    }
}