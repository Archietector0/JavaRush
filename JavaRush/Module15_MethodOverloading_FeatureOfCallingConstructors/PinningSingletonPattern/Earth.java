public class Earth implements IPlanet {
    private static Earth instance;

    private Earth () {}
    public static Earth getInstance () {
        if (instance == null)
            instance = new Earth();
        return instance;
    }
}