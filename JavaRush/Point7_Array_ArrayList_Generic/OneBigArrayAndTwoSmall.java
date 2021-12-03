import java.io.*;

public class OneBigArrayAndTwoSmall {
    final private static int bigSize = 20;

    public static void main(String[] args) throws IOException {
        int[] bigArr = new int[20];
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        for (int i = 0; i < bigSize; ++i) {
            System.out.print("Enter num #" + (i + 1) + ": ");
            bigArr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < (bigSize / 2); ++i) {
            smallArr1[i] = bigArr[i];
        }

        for (int i = 0; i < (bigSize / 2); ++i) {
            smallArr2[i] = bigArr[(bigSize / 2) + i];
        }

        for (int i = 0; i < bigSize; ++i) {
            System.out.println("bigArr[" + i + "]: " + bigArr[i]);
        }

        System.out.println();

        for (int i = 0; i < (bigSize / 2); ++i) {
            System.out.print("smallArr1["  + i + "]: " + smallArr1[i]);
            System.out.print("                   ");
            System.out.println("smallArr2["  + i + "]: " + smallArr2[i]);
        }






    }
}