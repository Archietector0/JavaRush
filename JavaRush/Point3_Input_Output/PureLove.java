import java.io.*;

public class PureLove {
    public static void main ( String[] args ) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Enter name1: ");
        String name1 = bufferedReader.readLine();
        System.out.print("Enter name2: ");
        String name2 = bufferedReader.readLine();
        System.out.print("Enter name3: ");
        String name3 = bufferedReader.readLine();

        pureLove(name1, name2, name3);
    }

    public static void pureLove (String name1, String name2, String name3) {
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}