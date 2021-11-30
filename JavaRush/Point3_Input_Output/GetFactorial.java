public class GetFactorial {
    public static void main(String[] args) {
        int num = -2;

        if (getFactorial( num ) < 0)
            System.out.println("ERROR: Invalid argument.");
        else
            System.out.println("Result of !" + num + ": " + getFactorial(num));
    }

    public static int getFactorial (int num) {
        int fact = 1;

        if (num < 0)
            return -1;
        else {
            for (int i = 1; i <= num; ++i)
                fact *= i;
            return fact;
        }
    }
}