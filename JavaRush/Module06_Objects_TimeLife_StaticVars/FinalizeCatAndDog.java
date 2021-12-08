public class FinalizeCatAndDog {
    public static void main(String[] args) throws Throwable {
        Cat cat = new Cat();
        cat.finalize();
        System.out.println();

        Dog dog = new Dog();
        dog.finalize();
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