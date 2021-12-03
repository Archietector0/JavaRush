import java.io.*;
import java.util.ArrayList;

public class ArrayList5Lines {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<String>();

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        for (int i = 0; i < 5; ++i) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            arr.add(bufferedReader.readLine());
        }

        for (int i = 0; i < 5; ++i) {
            System.out.println("arr[" + (i + 1) + "]: " + arr.get(i));
        }
    }


}