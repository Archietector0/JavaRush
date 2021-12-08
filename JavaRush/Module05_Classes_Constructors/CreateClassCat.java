public class CreateClassCat {
    public static void main(String[] args) {
        Cat Marlow = new Cat();
        Marlow.name = "Marlow";
        Marlow.age = 3;
        Marlow.weight = 5;
        Marlow.strength = 24;

        Cat Sanchez = new Cat();
        Sanchez.name = "Sanchez";
        Sanchez.age = 5;
        Sanchez.weight = 6;
        Sanchez.strength = 31;

        Cat Ramirez = new Cat();
        Ramirez.name = "Ramirez";
        Ramirez.age = 4;
        Ramirez.weight = 7;
        Ramirez.strength = 25;

        System.out.println("----------------------------------------");
        System.out.println("-----------__FIGHT_BATTLE_#1_-----------");
        System.out.println("----------------------------------------");


        System.out.println(Marlow.name + " VS " + Sanchez.name);
        System.out.println("Result, " + Marlow.name + " is " + Marlow.fight(Sanchez));

        System.out.println("----------------------------------------");
        System.out.println("-----------__FIGHT_BATTLE_#2_-----------");
        System.out.println("----------------------------------------");

        System.out.println(Marlow.name + " VS " + Ramirez.name);
        System.out.println("Result, " + Marlow.name + " is " + Marlow.fight(Ramirez));

        System.out.println("----------------------------------------");
        System.out.println("-----------__FIGHT_BATTLE_#3_-----------");
        System.out.println("----------------------------------------");

        System.out.println(Sanchez.name + " VS " + Ramirez.name);
        System.out.println("Result, " + Sanchez.name + " is " + Sanchez.fight(Ramirez));

    }
}

class Cat {
    public String  name;
    public int     age;
    public int     weight;
    public int     strength;

    public boolean fight (Cat other) {
        int scoreMy = 0;
        int scoreOth = 0;

        if (this.age > other.age)
            scoreMy++;
        else
            scoreOth++;

        if (this.strength > other.strength)
            scoreMy++;
        else
            scoreOth++;

        if (this.weight > other.weight)
            scoreOth++;
        else
            scoreMy++;

        if (scoreMy > scoreOth)
            return true;
        else
            return false;
    }
}