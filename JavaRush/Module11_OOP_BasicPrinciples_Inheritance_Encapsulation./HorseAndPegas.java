/**
 * Написать два класса: Horse(лошадь) и Pegas(пегас). Унаследовать пегаса от лошади.
 */

public class HorseAndPegas {
    public static void main(String[] args) {
        Pegas pegas = new Pegas();
        Horse horse = new Horse();

        pegas.setAge(3);
        horse.setAge(4);

        pegas.setName("Pega");
        horse.setName("Hope");

        System.out.println("Horse name is: " + horse.getName() + " age is: " + horse.getAge());
        System.out.println("Pegas name is: " + pegas.getName() + " age is: " + pegas.getAge());

        System.out.println();
    }

}

class Horse {
    private String  name;
    private int     age;

    public Horse () {}

    public Horse ( String neme, int age ) {
        this.name = neme;
        this.age = age;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }
}

class Pegas extends Horse {

}