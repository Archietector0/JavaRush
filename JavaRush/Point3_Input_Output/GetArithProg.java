public class GetArithProg {
    public static void main(String[] args) {
        int num = -4;
        if (getArithProg( num ) < 0)
            System.out.println("ERROR: Invalid argument.");
        else
            System.out.println("Result of ArithProg " + num + ": " + getArithProg( num ));
    }

    public static int getArithProg ( int num ) {
        int sum = 0;

        if (num < 0)
            return -1;
        else {
            for (int i = 0; i <= num; ++i)
                sum += i;
            return sum;
        }
    }
}