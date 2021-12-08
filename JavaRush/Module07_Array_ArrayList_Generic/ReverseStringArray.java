import java.io.*;
public class ReverseStringArray {

    public static void main(String[] args) throws IOException {
        String[] strArr = new String[10];

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        for (int i = 0; i < 8; ++i) {
            System.out.println("Enter string #" + (i + 1) + ": ");
            strArr[i] = bufferedReader.readLine();
        }

        for (int i = 0; i < 8; ++i) {
            System.out.println("strArr[" + (8 - i) + "]: " + strArr[8 - i]);
        }

    }
}