public class InterceptionException {
    public static void main(String[] args) throws Exception {
        try {
            mainMeth();
            System.out.println("Note: Exception not found!");
        } catch (Exception e) {
            System.out.println("ClassName: " + e.getClass());
        }

    }

    public static void mainMeth () throws Exception1, Exception2, Exception3 {
        int rand = (int) (Math.random() * 3);
        if (rand == 1)
            throw new Exception1();
        if (rand == 2)
            throw new Exception2();
        if (rand == 3)
            throw new Exception3();
    }
}

class Exception1 extends Exception {

}

class Exception2 extends Exception1 {

}

class Exception3 extends Exception2 {

}