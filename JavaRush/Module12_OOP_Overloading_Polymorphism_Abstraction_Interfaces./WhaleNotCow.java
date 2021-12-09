/**
 * Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
 * Я не корова, Я – кит.
 */

public class WhaleNotCow {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Cow whale = new Whale();

        System.out.println(cow.getName());
        System.out.println(whale.getName());
    }
}

class Cow {

    public String getName () {
        return "I'm a cow.";
    }
}

class Whale extends Cow {
    public String getName () {
        return "I'm not a cow, I'm a whale.";
    }

}

