import java.io.*;

public class MaxFrom20Num {
    final private static int sizeArr = 20;
    public static void main(String[] args) throws IOException {
        int[] ourArr = initializeArray();
        System.out.println();
        System.out.println("Result: " + max(ourArr));
    }

    public static int[] initializeArray() throws IOException {
        int [] arr = new int[sizeArr];

        InputStream     inputStream = System.in;
        Reader          reader = new InputStreamReader(inputStream);
        BufferedReader  bufferedReader = new BufferedReader(reader);

        for (int i = 0; i < sizeArr; ++i) {
            System.out.print("Enter num #" + (i + 1) + ": ");
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        return arr;
    }

    public static int max ( int[] arr ) {
        int max = arr[0];

        for (int i = 0; i < sizeArr; ++i) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

}