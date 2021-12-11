package SomeBridges.Bridges;

public class SuspensionBridge implements Bridge {
    public int getCarsCount() {
        return (int) (Math.random() * 45);
    }
}
