public class CatsCounter {
    static int CATS_COUNT = 0;
    public static void main(String[] args) throws Throwable {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println("Cat counter: " + CATS_COUNT);

        cat1.finalize();

        System.out.println("Cat counter: " + CATS_COUNT);

    }

    public static class Cat {
        public Cat () {
            System.out.println("Cat constructor was called!");
            CATS_COUNT++;
        }

        protected void finalize () throws Throwable {
            System.out.println("Cat object was cleared!");
            CATS_COUNT--;
        }

    }
}