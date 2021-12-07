import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class InterceptionCheckedException {
    public static void main(String[] args) {
        try {
            processExceptions();
            System.out.println("Exception not found!");
        } catch (Exception e) {
            System.out.println("Exception class name: " + e.getClass());
        }
    }

    public static void processExceptions () throws Exception {
        int rand = (int) (1 + (Math.random() * 6));

        if (rand == 1) {
            throw new ClassNotFoundException();
        }
        if (rand == 2) {
            throw new InterruptedException();
        }
        if (rand == 3) {
            throw new IOException();
        }
        if (rand == 4) {
            throw new InstantiationException();
        }
        if (rand == 5) {
            throw new SQLException();
        }
        if (rand == 6) {
            throw new FileNotFoundException();
        }
    }
}