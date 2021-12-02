public class CreateClassFriend {
    public static void main(String[] args) {
        Friend john = new Friend();

        System.out.println("-----------------------------");
        System.out.println("------CHECK_INITIALIZE-------");
        System.out.println("-----------------------------");

        john.initialize("John");
        System.out.println("Name: " + john.name);
        System.out.println("Age: " + john.age);
        System.out.println("Male: " + john.male + "\n");

        john.initialize("Markus", 16);
        System.out.println("Name: " + john.name);
        System.out.println("Age: " + john.age);
        System.out.println("Male: " + john.male + "\n");

        john.initialize("Calvin", 23, "Man");
        System.out.println("Name: " + john.name);
        System.out.println("Age: " + john.age);
        System.out.println("Male: " + john.male + "\n");
    }
}


class Friend {
    public String   name;
    public int      age;
    public String   male;

    public void initialize ( String name ) {
        this.name = name;
    }

    public void initialize ( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public void initialize ( String name, int age, String male ) {
        this.name = name;
        this.age = age;
        this.male = male;
    }
}