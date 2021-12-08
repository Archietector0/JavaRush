/**
 * Скрыть все внутренние переменные класса Cat1, но только те,
 * к которым остается доступ с помощью методов.
 */

public class GiveAccess {
    public static void main(String[] args) {}
}

class Cat1 {
    public int      lengthOfTail;
    private String  name;
    private int     age;

    public void setName ( String name ) {
        this.name = name;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

}