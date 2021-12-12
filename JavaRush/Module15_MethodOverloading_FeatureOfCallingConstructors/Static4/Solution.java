/*
    Внутри статического блока:
    1. Создайте класс Cat
    2. Внутри Cat создайте поле класса String name = "Пушок"
    3. Создайте объект класса Cat - myCat
    4. Присвойте статическому объекту Object cat объект, созданный в п.3
    5. Выведите в консоль myCat.name
*/

public class Solution {

    static {
        class Cat {
            public String name = "Pushok";
        }

        Cat     myCat = new Cat();
        Object  cat = myCat;
        System.out.println("Result: " + cat);
    }

    public static void main(String[] args) {}
}