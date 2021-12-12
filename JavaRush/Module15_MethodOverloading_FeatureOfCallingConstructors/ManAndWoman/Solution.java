/*
    1. В методе main создать 2 человека man и woman. man с типом Man, woman с типом Woman.
    2. Изменить метод printName так, чтобы он выполнялся для man и woman.
    3. Реализация метода printName должна быть одна.
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Alex");
        Woman woman = new Woman("Zhanna");

        man.printName();
        woman.printName();
    }

    public static class Creature {
        protected String name;

        public Creature (String name) {
            this.name = name;
        }
        public void printName () {
            if (this instanceof Woman)
                System.out.println(this.name);
            else if (this instanceof Man)
                System.out.println(this.name);
        }
    }

    public static class Woman extends Creature {
        public Woman (String name) {
            super(name);
        }

    }

    public static class Man extends Creature {
        public Man (String name) {
            super(name);
        }
    }
}