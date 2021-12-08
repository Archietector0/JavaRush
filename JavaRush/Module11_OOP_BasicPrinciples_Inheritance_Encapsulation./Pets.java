/**
 * Написать три класса: Pet(домашнее животное), Cat(кот) и Dog(собака).
 * Унаследовать кота и собаку от животного.
 */

public class Pets {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Kitty-Cat";
        dog.name = "MC_Doggy";

        cat.tail = true;
        dog.tail = false;

        System.out.println("Cat name: " + cat.name + " Have a tail? -" + cat.tail);
        System.out.println("Dog name: " + dog.name + " Have a tail? -" + dog.tail);

    }
}

class Pet {
    String  name;
    boolean tail;
}

class Cat extends Pet {

}

class Dog extends Pet {

}