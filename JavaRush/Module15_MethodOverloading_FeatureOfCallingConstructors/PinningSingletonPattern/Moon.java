public class Moon implements IPlanet {
    private static Moon instance;

    private Moon () {}
    public static Moon getInstance () {
        if (instance == null)
            instance = new Moon();
        return instance;
    }
}