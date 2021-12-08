public class GetMultiplicationTable {
    public static void main(String[] args) {
        int num = 5;
        getMultiTable(num);
    }

    public static void getMultiTable ( int num ) {
        for (int x = 1; x <= num; ++x) {
            for (int y = 1; y <= num; ++y)
                System.out.print(String.format("%7s", (" " + (x * y) + " ")));
            System.out.println();
        }
    }
}