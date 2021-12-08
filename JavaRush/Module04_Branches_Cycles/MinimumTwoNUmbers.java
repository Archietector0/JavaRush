import java.io.*;

public class MinimumTwoNUmbers {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Enter first number: ");
        String sNum1 = bufferedReader.readLine();
        System.out.print("Enter second number: ");
        String sNum2 = bufferedReader.readLine();
        int iNum1 = Integer.parseInt(sNum1);
        int iNum2 = Integer.parseInt(sNum2);
        System.out.println("Result min: " + minimum(iNum1, iNum2));
        
    }

    public static int minimum (int num1, int num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
}
