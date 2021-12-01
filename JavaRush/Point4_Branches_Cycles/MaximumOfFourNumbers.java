import java.io.*;

public class MaximumOfFourNumbers {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Enter num1: ");
        String sNum1 = bufferedReader.readLine();
        System.out.print("Enter num2: ");
        String sNum2 = bufferedReader.readLine();
        System.out.print("Enter num3: ");
        String sNum3 = bufferedReader.readLine();
        System.out.print("Enter num4: ");
        String sNum4 = bufferedReader.readLine();

        int iNum1 = Integer.parseInt(sNum1);
        int iNum2 = Integer.parseInt(sNum2);
        int iNum3 = Integer.parseInt(sNum3);
        int iNum4 = Integer.parseInt(sNum4);

        System.out.println("Result : " + maximumOfFourNumbers(iNum1, iNum2, iNum3, iNum4));

    }

    public static int maximumOfFourNumbers (int num1, int num2, int num3, int num4) {
        int res1, res2;
        res1 = maximumOfTwoNumbers(num1, num2);
        res2 = maximumOfTwoNumbers(num3, num4);
        if (res1 <= res2)
            return res1;
        else
            return res2;
    }

    public static int maximumOfTwoNumbers (int num1, int num2) {
        if (num1 <= num2)
            return num1;
        else
            return num2;
    }
}