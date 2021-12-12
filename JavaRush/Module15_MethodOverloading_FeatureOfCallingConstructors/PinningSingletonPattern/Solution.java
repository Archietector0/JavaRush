/*
    1. Найти в гугле пример для - Singleton pattern Lazy initialization.
    2. По образу и подобию в отдельных файлах создать три синглтон класса Sun, Moon, Earth.
    3. Реализовать интерфейс Planet для классов Sun, Moon, Earth.
    4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet.
    5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
    5.1. С консоли считать один параметр типа String.
    5.2. Если параметр равен одной из констант интерфейса Planet, то создать соответствующий объект и
        присвоить его Planet thePlanet, иначе обнулить Planet thePlanet.
    5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static IPlanet thePlanet;

    static {
        try {
            System.out.println("\nWe are in static block!");
            readKeyFromConsoleAndInitPlanet();
            System.out.println("We are leave static block!\n");

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void readKeyFromConsoleAndInitPlanet () throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String entered;

        System.out.print("Enter planet name: ");
        entered = buff.readLine();
        if (entered.equals(IPlanet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else if (entered.equals(IPlanet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (entered.equals(IPlanet.SUN)) {
            thePlanet = Sun.getInstance();
        } else
            thePlanet = null;

    }

    public static void main(String[] args) throws IOException {
        System.out.println("We are in Main.");
        System.out.println("Val in thePlanet: " + thePlanet + "\n");
    }

}