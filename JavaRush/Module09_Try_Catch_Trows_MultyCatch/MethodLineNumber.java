public class MethodLineNumber {
    public static void main(String[] args) {
        method1();
    }

    public static void method1 () {
        method2();
    }

    public static void method2 () {
        method3();
    }

    public static void method3 () {
        method4();
    }

    public static void method4 () {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for ( StackTraceElement element : stackTraceElement ) {
            System.out.println("LineNumber: " + element.getLineNumber());
        }
    }
}