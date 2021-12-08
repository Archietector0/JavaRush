public class StringHelperMain {
    public static void main(String[] args) {
        System.out.println("Result #1: " + StringHelper.multiply("Hello 5 times."));
        System.out.println();
        System.out.println("Result #2: " + StringHelper.multiply("It's string.", 9));

    }
}

class StringHelper {
    public static String multiply(String s, int count) {
        if (count < 0)
            return "ERROR: Invalid argument 'count'!";
        for (int i = 0; i < count; ++i)
            System.out.println((i + 1) + ") " + s);
        return s;
    }

    public static String multiply(String s) {
        for (int i = 0; i < 5; ++i)
            System.out.println((i + 1) + ") " + s);
        return s;
    }


}