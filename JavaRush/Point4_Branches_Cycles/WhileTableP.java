public class WhileTableP {
    public static void main(String[] args) {
        int x, y;
        x = y = 1;

        while (x < 11) {
            while (y < 11) {
                System.out.print(String.format("%5s", " " + (x * y) + " "));
                ++y;
            }
            System.out.println();
            y = 1;
            ++x;
        }
    }
}