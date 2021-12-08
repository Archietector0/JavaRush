import java.io.*;

public class ThereIsNotEnoughGood {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Enter a string: ");
        String string = bufferedReader.readLine();
        System.out.print("Enter times: ");
        String sTimes = bufferedReader.readLine();

        int iTimes = Integer.parseInt(sTimes);
        int i = 0;
        while (i < iTimes)
            System.out.println((i++ + 1) + ") " + string);
    }
}