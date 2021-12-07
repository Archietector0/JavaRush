/**
 *
 Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.

 I don't want to learn Java, I want a big salary

 Образец:
 Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
 е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
 */

public class Dop_BigSalary {
    final private static int size = 47;
    public static void main(String[] args) {
        StringBuilder phrase = new StringBuilder("I don't want to learn Java, I want a big salary");
        StringBuilder buff;

        System.out.println("\n-----------------------------------");
        System.out.println("-------------START_PROG------------");
        System.out.println("-----------------------------------\n");

        for (int i = 0; i < size; ++i) {
            System.out.println(phrase);
            buff = phrase.deleteCharAt(0);
            System.out.println(buff);
        }
        System.out.println(phrase);
    }
}