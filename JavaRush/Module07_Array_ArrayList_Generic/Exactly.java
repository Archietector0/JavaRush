import java.util.ArrayList;

public class Exactly {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String >();
        arr.add("Mother");
        arr.add("Washes");
        arr.add("Frame");

        setBetween(arr);
        printList(arr);
    }

    public static void setBetween ( ArrayList<String> arr ) {
        for (int i = 0; i < arr.size(); ++i) {
            if (i % 2 != 0)
                arr.add(i, " Exactly ");
        }
    }

    public static void printList ( ArrayList<String> arr ) {
        System.out.println("\n");
        for (int i = 0; i < arr.size(); ++i) {
            System.out.println("Index [" + i + "]: " + arr.get(i));
            System.out.println("\n");
        }
    }
}