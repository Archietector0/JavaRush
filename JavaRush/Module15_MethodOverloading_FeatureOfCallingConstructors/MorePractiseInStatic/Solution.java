/*
    Задача: 1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс Flyable.
    2. Класс Plane должен иметь 1 конструктор с параметром int – количество перевозимых пассажиров.
    3. В статическом методе reset класса Solution:
    3.1. Считать с консоли параметр типа String. Параметр может быть "plane" или "helicopter".
    3.2. Если параметр равен "helicopter", то статическому объекту Flyable result присвоить
    объект класса Helicopter.
    3.3. Если параметр равен "plane", то считать второй параметр типа int,
    статическому объекту Flyable result присвоить объект класса Plane.
    4. В статическом блоке инициализировать Flyable result вызвав метод reset.
    5. Закрыть поток ввода методом close().
*/

import java.io.*;

public class Solution {
    public static IFlyable result;

    public static IFlyable reset () throws IOException {
        BufferedReader  buff = new BufferedReader(new InputStreamReader(System.in));
        String          param;

        System.out.print("Enter parametr: ");
        param = buff.readLine();
        buff.close();
        if (param.equals("plane"))
            return new Plane(56);
        else if (param.equals("helicopter"))
            return new Helicopter();
        else
            System.out.println("ERROR: Invalid param.");
        return null;
    }

    static {
        try {
            result = reset();
        } catch (Throwable e) {
            System.out.println("ERROR: " + e.getMessage());;
        }
    }
    public static void main(String[] args) {
        System.out.println("Result: " + Solution.result);
    }
}