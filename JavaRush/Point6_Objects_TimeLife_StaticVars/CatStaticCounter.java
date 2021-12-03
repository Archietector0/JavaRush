public class CatStaticCounter {
    private static int catCount = 0;
    public static void main(String[] args) {
        System.out.println("Counter: " + CatStaticCounter.catCount);
        Cat cat = new Cat();
        System.out.println("Counter: " + CatStaticCounter.catCount);

    }

    public static class Cat {
        public Cat () {
            CatStaticCounter.catCount++;
        }
    }
}