public class InterceptionUncheckedException {
    public static void main(String[] args) {
        try {
            processException();
            System.out.println("Exception not found");
        } catch (RuntimeException e) {
            System.out.println("Class name exception: " + e.getClass());
        }
    }

    public static void processException () throws RuntimeException {
        int rand = (int) (Math.random() * 6);

        if (rand == 1) {
            throw new ArithmeticException();
        }
        if (rand == 2) {
            throw new ClassCastException();
        }
        if (rand == 3) {
            throw new NullPointerException();
        }
        if (rand == 4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (rand == 5) {
            throw new ArrayStoreException();
        }
        if (rand == 6) {
            throw new IllegalThreadStateException();
        }
    }
}