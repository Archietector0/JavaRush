public class Finalize50KCatAndDog {
    public static void main(String[] args) throws Throwable {
        Cat cat;
        Dog dog;
        int i = 0;

        while (i < 50000) {
            cat = new Cat();
//            cat.finalize();
            dog = new Dog();
//            dog.finalize();
            ++i;
        }

    }

    public static class Cat {
        public Cat () {
            System.out.println("Cat constructor was called!");
        }

        protected void finalize () throws Throwable {
            System.out.println("Cat object was cleared!");
        }
    }

    public static class Dog {
        public Dog () {
            System.out.println("Dog constructor was called!");
        }

        protected void finalize () throws Throwable {
            System.out.println("Dog object was cleared!");
        }
    }

}