import java.io.*;

public class DrawRectangle {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Enter num1: ");
        String sNum1 = bufferedReader.readLine();
        System.out.print("Enter num2: ");
        String sNum2 = bufferedReader.readLine();

        int iNum1 = Integer.parseInt(sNum1);
        int iNum2 = Integer.parseInt(sNum2);

        if (iNum1 < 0 || iNum2 < 0) {
            System.out.println("ERROR: Invalid arguments.");
            return;
        }

        System.out.println("\n");

        for (int y = 0; y < iNum1; ++y) {
            for (int x = 0; x < iNum2; ++x)
                System.out.print(String.format("%2s","8"));
            System.out.println();
        }





    }
}