public class FinalizeCat {
    public static void main(String[] args) throws Throwable {
        Cat cat1 = new Cat();
        cat1.finalize();
    }

    public static class Cat {
        public Cat () {
            System.out.println("Cat default constructor was called!");
        }

        protected void finalize() throws Throwable {
            System.out.println("Cat object was cleared!");
        }
    }
}