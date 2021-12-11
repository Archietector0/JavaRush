package ChickenFactory;

import ChickenFactory.Factory.*;

public class Start {
    public static void main(String[] args) {
        Hen russianHen = new RussianHen();
        System.out.println(russianHen.getDescription());

        Hen ukrainianHen = new UkrainianHen();
        System.out.println(ukrainianHen.getDescription());

        Hen belarusianHen = new BelarusianHen();
        System.out.println(belarusianHen.getDescription());

        Hen moldovanHen = new MoldovanHen();
        System.out.println(moldovanHen.getDescription());
    }
}