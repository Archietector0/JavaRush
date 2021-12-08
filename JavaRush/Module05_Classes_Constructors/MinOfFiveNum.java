import java.io.*;

public class MinOfFiveNum {
    public static void main(String[] args) throws IOException {
        SimpleMAth simpleMAth = new SimpleMAth();
        simpleMAth.setN( 5 );

        int[] arr = new int[simpleMAth.getN()];

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String  sRes;
        int     iRes;

        for (int i = 0; i < simpleMAth.getN(); ++i) {
            System.out.print("Enter num #" + (i + 1) + ": ");
            sRes = bufferedReader.readLine();
            iRes = Integer.parseInt(sRes);
            arr[i] = iRes;
        }
        System.out.println();

        for (int x = 0; x < arr.length; ++x)
            System.out.println("Arr["+ (x + 1) + "]: " + arr[x]);
        System.out.println("\nResult: " + simpleMAth.minOf5(arr));
    }

    public static class SimpleMAth {
        // Vars
        private int n;

        // Constructor
        public SimpleMAth () {}

        // Set / Get - methods
        public void setN ( int n ) {
            this.n = (n < 0) ? 0 :  n;
        }

        public int getN () {
            return this.n;
        }

        // External funcs
        public int minOf5 ( int ... arr ) {
            int min1 = (arr[0] < arr[1]) ? arr[0] : arr[1];
            int min2 = (arr[2] < arr[3]) ? arr[2] : arr[3];
            int min3 = (min1 < min2) ? min1 : min2;
            int res =  (min3 < arr[4]) ? min3 : arr[4];
            return res;
        }
    }
}