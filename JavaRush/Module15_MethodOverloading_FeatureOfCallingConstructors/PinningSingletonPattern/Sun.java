public class Sun implements IPlanet {
    private static Sun instance;

    private Sun () {}
    public static Sun getInstance () {
        if (instance == null)
            instance = new Sun();
        return instance;
    }
}