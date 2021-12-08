/**
 * Скрыть все внутренние переменные класса Catt.
 */

public class AllIsHidden {
    public static void main(String[] args) {
        Catt catt = new Catt();

//        catt.name = "Barsik"; - Error
//        catt.quantityLegs = 4; - Error
    }
}

class Catt {
    private String  name;
    private int     quantityLegs;
}