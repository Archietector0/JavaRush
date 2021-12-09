/**
 * Сделать класс Pegas(пегас) на основе класса Horse(лошадь) и интерфейса Flying(летать).
 */

public class NewsInProgram {
    public static void main(String[] args) {
        Pegas pegas = new Pegas();
        pegas.setName("Pega");
        System.out.println("Pegas's name: " + pegas.getName());
        System.out.println("Can it fly? - " + pegas.isAvailable());
    }
}

interface Flying {
    boolean isAvailable ();
    default void say () {}
}

class Horse {
    private String name;

    public Horse () {}

    public void setName ( String name ) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

}

class Pegas extends Horse implements Flying {
    @Override
    public boolean isAvailable () {
        return true;
    }
}