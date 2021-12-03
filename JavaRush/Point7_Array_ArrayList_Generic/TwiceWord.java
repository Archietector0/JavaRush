import java.io.*;
import java.util.ArrayList;

public class TwiceWord {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<String>();
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; ++i) {
            System.out.print("Enter name: ");
            arr.add(buff.readLine());
        }

        
    }
}