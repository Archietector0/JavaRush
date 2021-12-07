public class ExceptionWithArray {
    public static void main(String[] args) {
        try {
            System.out.println("Step 1");
            setValue();
            System.out.println("Step 2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Result of e: " + e.getMessage());
        }
    }

    public static void setValue () {
        int[] intArr = new int[2];
        intArr[8] = 5;
    }
}