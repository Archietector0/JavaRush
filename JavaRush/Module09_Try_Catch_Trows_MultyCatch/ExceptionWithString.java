public class ExceptionWithString {
    public static void main(String[] args) {
        String res;
        try {
            System.out.println("Step 1");
            res = getLowerCase();
            System.out.println("Result of func: " + res);
            System.out.println("Step 2");
        } catch (NullPointerException e) {
            System.out.println("Result of e: " + e.getMessage());
        }
    }

    public static String getLowerCase () {
        String str = null;
        String res = str.toLowerCase();

        return res;
    }
}