/**
 * Напиши свой public интерфейс Fly (летать). Добавь в него два метода.
 */

public class InterfaceFly {
    public static void main(String[] args) {
        Fly plane = new Plane();
        Fly helicopter = new Helicopter();

        plane.sound();
        System.out.println("Can it fly high? - " + plane.isFlyingHigh());

        System.out.println();

        helicopter.sound();
        System.out.println("Can it fly high? - " + helicopter.isFlyingHigh());

    }
}

interface Fly {
    void    sound ();
    boolean isFlyingHigh ();
}

class Helicopter implements Fly {
    @Override
    public void sound () {
        System.out.println("wzhoo-wzhoo-wzhoo-wzhoo-wzhoo");
    }

    @Override
    public boolean isFlyingHigh () {
        return false;
    }
}

class Plane implements Fly {
    @Override
    public void sound () {
        System.out.println("WZHOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Override
    public boolean isFlyingHigh () {
        return true;
    }
}