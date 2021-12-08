import java.io.*;

public class SponsorItSoundsProud {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter first name:");
        String name1 = bufferedReader.readLine();
        System.out.print("Enter second name:");
        String name2 = bufferedReader.readLine();

        sponsorItSoundsProud(name1, name2);
    }

    public static void sponsorItSoundsProud (String name1,  String name2) {
        System.out.println( name1 + " проспонсировал "+ name2 + ", и она стала известной певицей.");
    }
}