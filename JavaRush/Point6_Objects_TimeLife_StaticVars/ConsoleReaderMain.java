import java.io.*;

public class ConsoleReaderMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Boolean: " + ConsoleReader.readBoolean());
        System.out.println("Int: " + ConsoleReader.readInt());
        System.out.println("String: " + ConsoleReader.readString());
        System.out.println("Double: " + ConsoleReader.readDouble());

    }
}

class ConsoleReader {
    public static String readString () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter string: ");

        return bufferedReader.readLine();
    }

    public static int readInt () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter int number: ");
        String sNum = bufferedReader.readLine();

        return Integer.parseInt(sNum);
    }

    public static double readDouble () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter double number: ");
        String sNum = bufferedReader.readLine();

        return Double.parseDouble(sNum);
    }

    public static boolean readBoolean () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter boolean value: ");
        String sNum = bufferedReader.readLine();

        return Boolean.parseBoolean(sNum);
    }
}