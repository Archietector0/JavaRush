import java.util.ArrayList;

/**
 * Написать метод, который определяет, объект какого класса ему передали,
 * и выводит на экран одну из надписей: «Лиса», «Волк», «Птица», «Лампа».
 */

public class FoxOrWolfOrBirdOrLamp {
    public static void main(String[] args) {
        Fox     fox = new Fox();
        Wolf    wolf = new Wolf();
        Bird    bird = new Bird();
        Lamp    lamp = new Lamp();

        whichClass(lamp);
    }

    public static void whichClass ( Object obj ) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Fox");
        arrayList.add("Wolf");
        arrayList.add("Bird");
        arrayList.add("Lamp");

        for ( String exp : arrayList ) {
            String buff = obj.toString().substring(0, exp.length());
            if (exp.equals(buff))
                System.out.println("Class is: " + exp);
        }
    }
}

class Fox {}

class Wolf {}

class Bird {}

class Lamp {}