import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Exceptions {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Before method");
            strangeMethod();
            System.out.println("Exception not found");
        } catch (Exception e) {
            System.out.println("Result: " + e.toString());

        }
    }

    public static void strangeMethod () throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int rand;
        rand = (int) (Math.random() * 4);
        System.out.println(rand);
        if (rand == 1)
            throw new NullPointerException();
        if (rand == 2)
            throw  new ArithmeticException();
        if (rand == 3)
            throw new FileNotFoundException();
        if (rand == 4)
            throw new URISyntaxException("Lol", "Kek");

    }
}