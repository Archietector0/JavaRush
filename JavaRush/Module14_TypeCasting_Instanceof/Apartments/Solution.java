/*
    1. Реализовать метод cleanAllApartaments.
    Для каждого объекта из apartaments:
    2. Для однокомнатных квартир (Apt1Room) вызвать метод clean1Room, т.е. если объект типа Apt1Room, то вызвать у него метод clean1Romm.
    3. Для двухкомнатных квартир (Apt2Room) вызвать метод clean2Rooms, т.е. если объект типа Apt2Room, то вызвать у него метод clean2Rooms.
    4. Для трехкомнатных квартир (Apt3Room) вызвать метод clean3Rooms, т.е. если объект типа Apt3Room, то вызвать у него метод clean3Rooms.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Apartments> apartments = new ArrayList<Apartments>();

        apartments.add(new Apt1Room());
        apartments.add(new Apt2Room());
        apartments.add(new Apt3Room());

        cleanAllApartaments(apartments);
    }

    public static void cleanAllApartaments ( ArrayList<Apartments> apartments ) {
        for ( Apartments apartments1 : apartments ) {
            if (apartments1 instanceof Apt1Room)
                ((Apt1Room) apartments1).clean1Romm();
            else if (apartments1 instanceof Apt2Room)
                ((Apt2Room) apartments1).clean2Romm();
            else if (apartments1 instanceof Apt3Room)
                ((Apt3Room) apartments1).clean3Romm();
        }
    }
}

interface Apartments {}

class Apt1Room implements Apartments {
    public void clean1Romm () {
        System.out.println("Room is cleaned!");
    }
}
class Apt2Room implements Apartments {
    public void clean2Romm () {
        System.out.println("2 rooms are cleaned!");
    }
}
class Apt3Room implements Apartments {
    public void clean3Romm () {
        System.out.println("3 rooms are cleaned!");
    }
}


