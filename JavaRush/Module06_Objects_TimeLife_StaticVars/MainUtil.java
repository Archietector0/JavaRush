public class MainUtil {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        x1 = 6 ;
        y1 = 0;
        x2 = 3;
        y2 = 4;

        System.out.println("Result: " + Util.getDistance(x1, y1, x2, y2));
    }
}

class Util {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        double sA = x1 - x2;
        double sB = y1 - y2;

        double sC = Math.sqrt(Math.pow(sA, 2) + Math.pow(sB, 2));
        return sC;
    }
}