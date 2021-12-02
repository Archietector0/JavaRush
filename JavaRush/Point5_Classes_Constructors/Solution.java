public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man ("Alex", 21, "Samara, st. Solnechnaya 9");
        Man man2 = new Man ("Max", 22, "Moscow, st. Baumana 341");

        Woman woman1 = new Woman("Helen", 19, "Surgut, st. Radizcheva 43");
        Woman woman2 = new Woman("Kate", 15, "Zelenograd, st. Pavlova 21B");

        System.out.println("------------------------------");
        System.out.println("------CHECK_CONSTRUCTOR-------");
        System.out.println("------------------------------\n");

        System.out.println("Name: " + man1.getName());
        System.out.println("Age: " + man1.getAge());
        System.out.println("Address: " + man1.getAddress() + "\n");

        System.out.println("Name: " + man2.getName());
        System.out.println("Age: " + man2.getAge());
        System.out.println("Address: " + man2.getAddress() + "\n");

        System.out.println("Name: " + woman1.getName());
        System.out.println("Age: " + woman1.getAge());
        System.out.println("Address: " + woman1.getAddress() + "\n");

        System.out.println("Name: " + woman2.getName());
        System.out.println("Age: " + woman2.getAge());
        System.out.println("Address: " + woman2.getAddress() + "\n");

    }

    public  static class Woman {
        // Vars
        private String  name;
        private int     age;
        private String  address;

        // Constructors
        public Woman () {}

        public Woman ( String name ) {
            this.name = name;
        }

        public Woman ( String name, int age ) {
            this.name = name;
            this.age = age;
        }

        public Woman ( String name, int age, String address ) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        // Getter / Setter - methods
        public void     setName ( String name ) {
            this.name = name;
        }

        public void     setAge ( int age ) {
            this.age = age;
        }

        public  void    setAddress ( String address ) {
            this.address = address;
        }

        public String   getName () {
            return this.name;
        }

        public int      getAge () {
            return this.age;
        }

        public String   getAddress () {
            return this.address;
        }
    }



    public static class Man {
        // Vars
        private String  name;
        private int     age;
        private String  address;

        // Constructors
        public Man () {}

        public Man ( String name ) {
            this.name = name;
        }

        public Man ( String name, int age ) {
            this.name = name;
            this.age = age;
        }

        public Man ( String name, int age, String address ) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        // Getter / Setter - methods
        public void     setName ( String name ) {
            this.name = name;
        }

        public void     setAge ( int age ) {
            this.age = age;
        }

        public  void    setAddress ( String address ) {
            this.address = address;
        }

        public String   getName () {
            return this.name;
        }

        public int      getAge () {
            return this.age;
        }

        public String   getAddress () {
            return this.address;
        }
    }
}