/**
 * Переопределить метод getName в классе Whale(Кит),
 * чтобы программа ничего не выдавала на экран.
 */

public class NothingToPrint {
    public static void main(String[] args) {
        Cow1    cow1 = new Cow1();
        Cow1  whale1 = new Whale1();

        System.out.println("Result: " + cow1.getName());
        System.out.println("Result: " + whale1.getName());
    }
}

class Cow1 {
    public String getName () {
        return "I'm a cow.";
    }
}

class Whale1 extends Cow1 {
    public String getName () {
        return "";
    }
}

