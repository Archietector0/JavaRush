public class ConstructorFriend {
    public static void main(String[] args) {
        FriendC friendC = new FriendC();

        System.out.println("------------------------------");
        System.out.println("------CHECK_CONSTRUCTOR-------");
        System.out.println("------------------------------\n");

        System.out.println("Name: " + friendC.name);
        System.out.println("Age: " + friendC.age);
        System.out.println("Size: " + friendC.size + "\n");

        FriendC friendC1 = new FriendC("Levon");

        System.out.println("Name: " + friendC1.name);
        System.out.println("Age: " + friendC1.age);
        System.out.println("Size: " + friendC1.size + "\n");

        FriendC friendC2 = new FriendC("April", 20);

        System.out.println("Name: " + friendC2.name);
        System.out.println("Age: " + friendC2.age);
        System.out.println("Size: " + friendC2.size + "\n");

        FriendC friendC3 = new FriendC("Francheska", 23, 162);

        System.out.println("Name: " + friendC3.name);
        System.out.println("Age: " + friendC3.age);
        System.out.println("Size: " + friendC3.size + "\n");

    }
}

class FriendC {
    // Vars
    public String name;
    public int age;
    public int size;

    // Constructor
    public  FriendC () {}

    public FriendC ( String name ) {
        this.name = name;
    }

    public FriendC ( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public FriendC ( String name, int age, int size ) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

}