public class CreateClassDog {
    public static void main(String[] args) {
        Dog markus = new Dog();

        System.out.println("------------------------------");
        System.out.println("----------DEFAULT_SET---------");
        System.out.println("------------------------------\n");

        System.out.println("Name: " + markus.getName());
        System.out.println("Age: " + markus.getAge());

        System.out.println("\n------------------------------");
        System.out.println("----------CURRENT_SET---------");
        System.out.println("------------------------------\n");

        markus.setName("Markus");
        markus.setAge(12);

        System.out.println("Name: " + markus.getName());
        System.out.println("Age: " + markus.getAge());




    }
}

class Dog {
    private String  name;
    private int     age;

    public void     setName ( String name ) {
        this.name = name;
    }

    public String   getName () {
        return this.name;
    }

    public void     setAge ( int age ) {
        this.age = age;
    }

    public int      getAge () {
        return this.age;
    }
}