import java.util.ArrayList;

public class ExceptionWithListColl {
    public static void main(String[] args) {
        try {
            System.out.println("Step 1");
            getValueList();
            System.out.println("Step 2");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Result of e: " + e.getMessage());
        }
    }

    public static void getValueList () {
        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);
    }
}