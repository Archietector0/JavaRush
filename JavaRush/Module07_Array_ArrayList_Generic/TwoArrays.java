import java.io.*;

public class TwoArrays {
    final private static int str_num = 10;
    final private static int int_num = 10;

    public static void main(String[] args) throws IOException {
        String[]    strArr = new String[str_num];
        int[]       intArr = new int[int_num];

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        for (int i = 0; i < str_num; ++i) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            strArr[i] = bufferedReader.readLine();
        }

        System.out.println();

        for (int i = 0; i < int_num; ++i)
            intArr[i] = strArr[i].length();

        for (int i = 0; i < 10; ++i)
            System.out.println("intArr[" + i + "]: " + intArr[i]);
        System.out.println();

        for (int i = 0; i < 10; ++i)
            System.out.println("strArr[" + i + "]: " + strArr[i]);

    }
}