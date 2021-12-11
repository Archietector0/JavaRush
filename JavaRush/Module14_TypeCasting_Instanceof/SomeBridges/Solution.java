package SomeBridges;

import SomeBridges.Bridges.*;

public class Solution {
    public static void main(String[] args) {
        println(new SuspensionBridge());
        println(new WaterBridge());
    }

    public static void println(Bridge bridge) {
        if (bridge instanceof WaterBridge) {
            System.out.println(bridge.getCarsCount());
        } else if (bridge instanceof SuspensionBridge) {
            System.out.println(bridge.getCarsCount());
        }
    }
}
