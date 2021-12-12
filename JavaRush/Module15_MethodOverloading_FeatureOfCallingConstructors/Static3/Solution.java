/*
    1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
    - intVar с типом int
    - doubleVar с типом double
    - DoubleVar с типом Double
    - booleanVar с типом boolean
    - ObjectVar с типом Object
    - ExceptionVar с типом Exception
    - StringVar с типом String

    2. В методе main вывести их значения в заданном порядке.
*/

public class Solution {
    public int       intVar;
    public double    doubleVar;
    public Double    DoubleVar;
    public boolean   booleanVar;
    public Object    ObjectVar;
    public Exception ExceptionVar;
    public String    StringVar;

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("intVar: " + solution.intVar);
        System.out.println("doubleVar: " + solution.doubleVar);
        System.out.println("DoubleVar: " + solution.DoubleVar);
        System.out.println("booleanVar: " + solution.booleanVar);
        System.out.println("ObjectVar: " + solution.ObjectVar);
        System.out.println("ExceptionVar: " + solution.ExceptionVar);
        System.out.println("StringVar: " + solution.StringVar);
    }
}