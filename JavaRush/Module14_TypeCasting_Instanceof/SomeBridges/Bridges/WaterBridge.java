package SomeBridges.Bridges;

public class WaterBridge implements Bridge {
    public int getCarsCount() {
        return (int) (Math.random() * 19);
    }
}
