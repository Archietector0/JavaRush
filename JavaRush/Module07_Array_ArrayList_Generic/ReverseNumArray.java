import java.io.*;

public class ReverseNumArray {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        for (int i = 0; i < 10; ++i) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }


        System.out.println("\n--------------------------------------");
        System.out.println("-------------BEFORE_SWAP--------------");
        System.out.println("--------------------------------------\n");


        for (int i = 0; i < 10; ++i)
            System.out.println(arr[i]);

        swap(arr);
        System.out.println();

        System.out.println("\n--------------------------------------");
        System.out.println("--------------AFTER_SWAP--------------");
        System.out.println("--------------------------------------\n");

        for (int i = 0; i < 10; ++i)
            System.out.println(arr[i]);
    }

    public static void swap ( int[] arr ) {
        int pred = arr.length / 2;
        int buff;

        for (int i = 0; i < pred; ++i) {
            buff = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = buff;
        }
    }
}