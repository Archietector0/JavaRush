/*
    1. Для вывода использовать можно только переменные из класса Constants.
    2. В классе Ferrari реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
    3. В классе Lanos реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
    4. Создайте public static класс LuxuriousCar(РоскошнаяМашина).
    5. Создайте public static класс CheapCar(ДешеваяМашина).
    6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
    7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
    8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
    9. В класах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными способами модификаторы доступа так,
    *  чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
*/

import org.omg.CORBA.PUBLIC_MEMBER;

public class Solution {
    public static void main(String[] args) {
        LuxuriousCar luxuriousCar = new LuxuriousCar();
        LuxuriousCar ferrari = new Ferrari();

        luxuriousCar.printlnDesire();
        ferrari.printlnDesire();

        CheapCar cheapCar = new CheapCar();
        CheapCar lanos = new Lanos();

        cheapCar.printlnDesire();
        lanos.printlnDesire();
    }

    public static class LuxuriousCar {
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }


    public static class Ferrari extends LuxuriousCar {
        @Override
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        @Override
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }

    }

    public static class Constants {
        public static String WANT_STRING = "I want to ride a ";
        public static String LUXURIOUS_CAR = "luxury car.";
        public static String CHEAP_CAR = "cheap car.";
        public static String FERRARI_NAME = "Ferrari";
        public static String LANOS_NAME = "Lanos";
    }
}
