import java.io.*;

public class TakeOverTheWorld {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Введите имя: ");
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        System.out.print("Введите возраст: ");
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge);

        takeOverTehWorld(name, nAge);

    }

    public static void takeOverTehWorld (String name, int age) {
        System.out.println(name + " захватит мир через " + age +" лет. Му-ха-ха!");
    }
}