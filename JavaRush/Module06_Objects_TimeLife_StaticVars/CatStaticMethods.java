public class CatStaticMethods {
    private static int catCount = 0;
    public static void main(String[] args) {
        System.out.println("Counter: " + Cat.getCatCount());
        Cat cat = new Cat();
        System.out.println("Counter: " + Cat.getCatCount());
        System.out.println();

        Cat.setCatCount(10);
        System.out.println("Counter: " + Cat.getCatCount());
        Cat.setCatCount(34);
        System.out.println("Counter: " + Cat.getCatCount());

    }

    public static class Cat {
        public Cat () {
            CatStaticMethods.catCount++;
        }

        public static int getCatCount () {
            return CatStaticMethods.catCount;
        }

        public static void setCatCount ( int num ) {
            CatStaticMethods.catCount = (num < 0) ? 0 : num;
        }
    }
}