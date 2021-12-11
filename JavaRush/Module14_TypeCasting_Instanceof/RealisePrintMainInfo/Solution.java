/*
    1. Напиши реализацию метода printMainInfo, чтобы:
    1.1. Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
    1.2. Если в метод передают объект типа Movable, у этого объекта вызывался метод move.
    2. Метод main менять нельзя.
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo (Object obj) {
        if (obj instanceof Movable)
            ((Movable) obj).move();
        else if (obj instanceof Drawable)
            ((Drawable) obj).draw();
    }
}

interface Movable {
    void move ();
}

interface Drawable {
    void draw ();
}

class Circle implements Movable {
    public void move () {
        System.out.println("Object is move.");
    }
}

class Rectangle implements Drawable {
    public void draw () {
        System.out.println("Object is draw.");
    }
}