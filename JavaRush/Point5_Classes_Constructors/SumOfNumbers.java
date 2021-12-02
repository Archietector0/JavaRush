import java.io.*;

public class SumOfNumbers {
    public static void main(String[] args) throws IOException {
        InputStream     inputStream = System.in;
        Reader          inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader  bufferedReader = new BufferedReader(inputStreamReader);

        String  sNum = "None";
        int     sum = 0;
        int     iNum;

        while ( true ) {
            System.out.print("Enter next num: ");
            sNum = bufferedReader.readLine();
            if (sNum.equals("summa"))
                return;
            iNum = Integer.parseInt( sNum );
            sum += iNum;
            System.out.println("Current sum: " + sum);
        }
    }
}