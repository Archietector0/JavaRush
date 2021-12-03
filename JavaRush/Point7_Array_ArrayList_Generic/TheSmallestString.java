import java.io.*;
import java.util.ArrayList;

public class TheSmallestString {
    final public static int size = 5;
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> res = new ArrayList<String>();

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int counter = 0;

        for (int i = 0; i < size; ++i) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            arr.add(bufferedReader.readLine());
        }

        int min = arr.get(0).length();

        for (int i = 0; i < size; ++i)
            if (arr.get(i).length() < min)
                min = arr.get(i).length();

        for (int i = 0; i < size; ++i) {
            if (arr.get(i).length() == min) {
                res.add(arr.get(i));
                ++counter;
            }
        }

        for (int i = 0; i < counter; ++i)
            System.out.println("Result #" + (i + 1) + ": " + res.get(i));
    }

}