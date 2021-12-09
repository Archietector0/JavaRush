/**
 * Переопределить метод getChild в классах Cat(кот) и Dog(собака),
 * чтобы кот порождал кота, а собака – собаку.
 */

public class CatFromCatAndDogFromDog {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

//        Dog dog = new Dog();
//        Cat cat = new Cat();
        Dog dogEx;
        Cat catEx;

        dogEx = (Dog) dog.getChild();
        System.out.println("Class name: " + dogEx);
        catEx = (Cat) cat.getChild();
        System.out.println("Class name: " + catEx);

    }
}

class Animal {
    Animal getChild () {
        return new Animal();
    }
}

class Cat extends Animal {
    Cat getChild () {
        return new Cat();
    }
}

class Dog extends Animal {
    Dog getChild () {
        return new Dog();
    }
}