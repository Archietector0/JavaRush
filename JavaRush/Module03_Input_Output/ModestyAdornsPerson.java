import java.io.*;

public class ModestyAdornsPerson {
    public static void main(String[] args) throws  IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Enter name: ");
        String name = bufferedReader.readLine();

        modestyAdornsPerson( name );

    }

    public static void modestyAdornsPerson ( String name ) {
        System.out.println( name + " зарабатывает $5,000. Ха-ха-ха!" );
    }
}