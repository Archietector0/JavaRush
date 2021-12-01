public class Ssquare {
    public static void main(String[] args) {
        int x, y;
        x = y = 0;

        while (x < 10) {
            while (y < 10) {
                System.out.print("-S");
                ++y;
            }
            System.out.println();
            y = 0;
            ++x;
        }
    }
}